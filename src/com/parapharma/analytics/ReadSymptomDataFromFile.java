package com.parapharma.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private HashMap<String, Integer> symptoms = new HashMap<>();
	private String filepath;
	private BufferedReader reader = null;

	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	public ReadSymptomDataFromFile() {

	}

	/**
	 * @return
	 */
	@Override
	public HashMap<String, Integer> GetSymptoms() {

		if (filepath != null) {
			try {
				reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();
				while (line != null) {
					if (symptoms.containsKey(line)) {
						symptoms.put(line, symptoms.get(line) + 1);
					}
					line = reader.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}
		return symptoms;
	}
}