package com.icraftjava;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ageOfStudents = new int[5];// create a single dimensional array
				// Set Array Elements
		ageOfStudents[0] = 23;
		ageOfStudents[1] = 20;
		ageOfStudents[2] = 33;
		ageOfStudents[3] = 31;
		ageOfStudents[4] = 25;

		// Accessing array element
		for (int i = 0; i < ageOfStudents.length; i++) {

		System.out.println("Age of Student: "+ ageOfStudents[i]);
			}
	}

}
