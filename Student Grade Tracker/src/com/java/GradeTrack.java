package com.java;

import java.util.Scanner;

public class GradeTrack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// no. of student
		System.out.println("Enter Number of Students: ");
		int numStudent = sc.nextInt();
		
		// array to store grade 
		int[] grade = new int[numStudent];
		
		// take input
		for(int i=0; i<numStudent; i++) {
			System.out.println("Enter Grade of Student: " + (i + 1));
			
			grade[i] = sc.nextInt();
		//	grades.add(grade);
		}
		
		// calculate average highest, lowest
		int sum = 0;
		int highest = grade[0];
		int lowest = grade[0];
		
		for(int i=0; i<numStudent; i++) {
			sum = sum + grade[i];
			
			if(grade[i] > highest) {
				highest = grade[i];
			}
			
			if(grade[i] < lowest) {
				lowest = grade[i];
			}
		}
		
		double average = (double) sum / numStudent;
		
		// display result
		System.out.println("");
		System.out.println("Results");
		System.out.println("Average Grade: " + average);
		
		System.out.println("Highest Grade: " + highest);
		System.out.println("Lowest Grade: " + lowest);

	}

}
