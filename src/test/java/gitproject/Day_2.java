package gitproject;

import java.util.Scanner;
public class Day_2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n = sc.nextInt();
         int i =1;
         int fact = 1;
         while(i<=n){
             fact = fact * i;
             i++;
         }
         System.out.println("Factorail of a number is:");
         System.out.println(fact);

     }
 }

