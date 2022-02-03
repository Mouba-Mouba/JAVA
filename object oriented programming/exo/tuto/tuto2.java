package tuto;

import java.util.Scanner;

public class tuto2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		//sum
		
		/*int num = reader.nextInt();
		
		int sum = 0;
		
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println("The sum is: " + sum);*/
		
		//power
		
		/*int n = reader.nextInt();
		int m = reader.nextInt();
		int total = 1;
		
		while (m != 0) {
			total *= n;
			m--;
		}
		
		System.out.println("The result is: " + total);*/
		
		//palindrome
		
		/*int number = reader.nextInt();
		int result = 0;
		int temp = number;
		
		while(number !=0) {
			result *= 10;
			result += number % 10;
			number /= 10;
		}
		if (result == temp) 
			System.out.println(temp + " is a palindrome");
		else
			System.out.println(temp + " is not a palindrome");*/
		
		//winners
		
	/*	int n = reader.nextInt();
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
		
		//operations
		
		int n = reader.nextInt();
		
		String add1 = "X++";
		String add2 = "++X";
		String sub1 = "X--";
		String sub2 = "--X";
		
		int x = 0;
		for (int i = 0; i < n; i++) {
			String op;
			op = reader.next();
			
			if (op.equals(add1))
				x++;
			if (op.equals(add2))
				++x;
			if (op.equals(sub1))
				x--;
			if (op.equals(sub2))
				--x;
		}
		
		System.out.println("The final value od X is: " + x);
		reader.close();
	}
	
}
