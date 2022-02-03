import java.util.*;

public class HeightAge{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);


		int student_number = input.nextInt();
		
		String [] names = new String[student_number];
		int[][] student_info = new int[student_number][2];

		for(int i = 0; i < student_number; i++){
			String student_name = input.next();
			int student_height = input.nextInt();
			int student_age = input.nextInt();

			names[i] = student_name;
			student_info[i][0] = student_height;
			student_info[i][1] = student_age;
		}

		int tallest = 0, oldest = 0;
		int tallest_index = 0, oldest_index = 0;
		for(int i = 0; i < student_number; i++){
			// Find the tallest student
			if(student_info[i][0] > tallest){
				tallest = student_info[i][0];
				tallest_index = i;
			}

			// Find the oldest student
			if(student_info[i][1] > oldest){
				oldest = student_info[i][1];
				oldest_index = i;
			}
		}

		System.out.println("Tallest: " + names[tallest_index]);
		System.out.println("Oldest: " + names[oldest_index]);
	}
}
