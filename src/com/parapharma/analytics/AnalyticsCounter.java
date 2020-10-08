package com.parapharma.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnalyticsCounter {



	// class attributes (AnalyticsCounter class from Alex)
	private String symptom = "";
	public static int counter = 0;
	private static int counterInstances = 0;

	//----------Constructors-------------//
	// constructor part1
	public AnalyticsCounter() throws IOException {
		counter++;
		counterInstances++;
	}
	// constructor part2
	public AnalyticsCounter(String sSymptom) throws IOException {
		symptom = sSymptom;
		counter++;
		counterInstances++;
	}
	//--------------end-----------------//



	//--------Getters and Setters-------//
	// return name of the symptom (symptom Getter)
	public String getSymptom() {
		return symptom;
	}
	// set name of the symptom (symptom Setter)
	public void setSymptom(String sSymptom) {
		symptom = sSymptom;
	}
	//-------------next attrbt.---------//
	// to use the symptom instances count (counter Getter)
	public static int getCounterInstances() {
		return counterInstances;
	}





	}

