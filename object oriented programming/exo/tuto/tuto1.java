package tuto;

import java.util.Scanner;

public class tuto1 {

	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		// exo 1:if the number is a odd number then "Yes" if it's a even number then "No"
	/*	int num = reader.nextInt();
		if (num > 2 && num%2 == 0) {
			System.out.println ("Yes");
		}else {
			System.out.println ("No");
		}*/
		
		// exo 2
	/*	int max = 0;
		int count = 0;
		int num;
	for (int i = 0 ; i < 6 ; i++) {
		  num = reader.nextInt();
		if (num > max) {
			max = num;
			count = 1;
		}
		else if (num == max) {
			count ++;
		}
		
	}
       System.out.println("The max is: " +max+ " and it appeared: " + count + " times.");
       
       // exo 3
        int max = 0;
		int count = 0;
		int num = reader.nextInt();
	while (num != 0) {
		if (num > max) {
			max = num;
			count = 1;
		}
		else if (num == max) {
			count ++;
		}
		
	}
       System.out.println("The max is: " +max+ " and it appeared: " + count + " times.");*/
		
		int n, m;
		n = reader.nextInt();
		m = reader.nextInt();
		int res = 1;
		for (int i = 0; i < m; i++) {
			res *= n;
		}
		System.out.println(n + " to the power of " + m + " is " + res);
		
		reader.close();
	}

}
