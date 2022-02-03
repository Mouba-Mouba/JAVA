import java.util.*;

public class SumDigits{

	public static int sumDigits(int number){
		int sum = 0;
		while(number > 0){
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		for(int i = 0; i < n; i++){
			int number = input.nextInt();
			System.out.println(sumDigits(number));
		}
	}
}