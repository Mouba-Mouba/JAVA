package assignments;
import java.util.Scanner;
public class Location {

	public static void main(String[] args) {
		int raw[] = new int[5];
		int colunm[] = new int[5];
		Scanner input = new Scanner(System.in);
		for(int i=0; i<raw.length; i++) {
			System.out.println("Enter number "+(i+1)+": ");
			raw[i] = input.nextInt();
		}
		for(int i=0; i<colunm.length; i++) {
			System.out.println("Enter number "+(i+1)+": ");
			colunm[i] = input.nextInt();
		}
		double a[][] = new double[raw.length][colunm.length];
		for(int i = 0; i < raw.length; i++) {
			for (int j = 0; j < colunm.length; j++) {
				a[i][j] = colunm[j];
			}
		}
		locateLargest(a);
		
		input.close();
		
	}
	
	public static void locateLargest(double[][]a) {
		 double maxValue = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(maxValue<a[i][j]) {
					maxValue = a[i][j];
				}
			}
		}
		System.out.println("The largest is: "+maxValue);
	}

}
