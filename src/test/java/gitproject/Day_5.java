package gitproject;

import java.util.Scanner;
public class Day_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks of physics");
		int m1 = s.nextInt();
		System.out.println("Enter marks of Chemistry");
		int m2 = s.nextInt();
		System.out.println("Enter marks of Biology");
		int m3 = s.nextInt();
		System.out.println("Enter marks of Mathematics");
		int m4 = s.nextInt();
		System.out.println("Enter marks of Computer");
		int m5 = s.nextInt();
        float total = (m1+m2+m3+m4+m5);
        float per = (total/500)*100;
        System.out.println("Total Marks:" +total);
        System.out.println("Total Percentage:" +per);
      }

}
