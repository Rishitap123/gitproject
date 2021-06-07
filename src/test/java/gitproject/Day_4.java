package gitproject;

import java.util.Scanner;
public class Day_4 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter marks of physics");
		int m1 = s.nextInt();
		System.out.println("Enter marks of Math");
		int m2 = s.nextInt();
		System.out.println("Enter marks of chemistry");
		int m3 = s.nextInt();
		int total = (m1+m2+m3);
		float CGPA = total/30;
		double per = (CGPA*9.5);
		System.out.println("sum of three subject:" +total);
		System.out.println("Calculate CGPA:" +CGPA);
		System.out.println("total Percentage:" +per);
		}
}
