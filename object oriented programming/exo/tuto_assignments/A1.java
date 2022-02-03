package tuto_assignments;

import java.util.Scanner;

public class A1 {
	public static void main(String arg[]) {
		Scanner reader = new Scanner(System.in);
		// exo1 : watermelon
	/*	System.out.println("Enter a number: ");
		int num = reader.nextInt();
		if (num >= 2 && num%2 == 0) {
			System.out.println("YES");}
		else {
			System.out.println("NO");
		} */
		
		// exo2 : even digits
		System.out.println("Enter two numbers: ");
		int count = 0;
		int m = reader.nextInt();
		int n = reader.nextInt();
		for (int i = m ; i < n ; i++) {
			if (i % 2 == 0) {
				count ++;
			}
		}
		System.out.println("Even numbers are: " + count);
		
		// exo3 : sum digits
	/*	int sum = 0;
		System.out.println("Enter a number: ");
		int num = reader.nextInt();
		while (num != 0) {
			sum += num %10;
			num /= 10;
		}
		System.out.println("The sum of the number is: " + sum);*/
		
		// exo4 : count max digit
	/*	int max = 0;
		int count = 0;
		System.out.println("Enter a number: ");
		for(int i=0 ; i<6 ; i++) {
			int n = reader.nextInt();
			if (n > max) {
				max = n;
				count = 1;
			}
			else if (n == max) {
				count ++;
			}
		}
		System.out.println( max + ", " + count );*/
		
		// exo5 : powers
	/*	System.out.println("Enter two numbers: ");
		int n = reader.nextInt();
		int m = reader.nextInt();
		int total = 1;
		
		while(m != 0) {
			total *= n;
			m --;
		}
		System.out.println("The result is: " + total);*/
		
		// exo6 : palindrome
	/*	System.out.println("Enter a number: ");
		int n = reader.nextInt();
		int result = 0;
		int temp = n;
		
		while (n != 0) {
			result *= 10;
			result += n % 10;
			n /= 10;
		}
		if (result == temp) 
			System.out.println(temp + " is a palindrome.");
		else
			System.out.println(temp + " is not a palindrome.");*/
		
		// exo7 : winners
	/*	System.out.println("Enter the number of players and the score: ");
		int n = reader.nextInt();
		int k = reader.nextInt();
		
		int[] player = new int[n];
		for (int i = 0; i < n; i++) {
			player[i] = reader.nextInt();
		}
		
		int counter = 0;
		for (int i = 0; i < n; i++) {
			if (player[i] >= player[k-1] && player[i] > 0)
				counter++;
		}
		
		System.out.println("The number of players qualifying is: " + counter);*/
		
		reader.close();
	}

}
