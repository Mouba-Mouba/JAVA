package tuto;

import java.util.Scanner;

public class tuto3 {

		public static void main(String[] args) {
			
			Scanner reader = new Scanner(System.in);
			
			System.out.println("Enter the number of student: ");
			int student_number = reader.nextInt();
			
			String student_name;
			int student_height, student_age;
			
			String[] names = new String[student_number];
			int[][] student_info = new int[student_number][2];
			
			//taking input
			for(int i = 0; i < student_number; i++) {
				System.out.println("Enter the name of the student: ");
				student_name = reader.next();
				System.out.println("Enter the height of the student: ");
				student_height = reader.nextInt();
				System.out.println("Enter the age of the student: ");
				student_age = reader.nextInt();
				
				names[i] = student_name;
				student_info[i][0] = student_height;
				student_info[i][1] = student_age;
			}
			
			//find the tallest and oldest students
			
			int tallest = 0, oldest = 0, tallest_index = 0, oldest_index = 0;
			for(int i = 0; i < student_number; i++) {
				if(student_info[i][0] > tallest) {
					tallest = student_info[i][0];
					tallest_index = i;
				}
				if(student_info[i][0] > oldest) {
					oldest = student_info[i][1];
					oldest_index = i;
				}
			}
			
			System.out.println("The tallest student is: " + names[tallest_index]);
			System.out.println("The oldest student is: " + names[oldest_index]);
			
			reader.close();
		}
		/*	private static int sum(int a) {
				Scanner reader = new Scanner(System.in);
				int N;
				int sum = 0;
				N = reader.nextInt();
				while (N != 0) {
					sum += N %10;
					N /= 10;
				}
				return sum;
		}*/	
}
