// MOHAMED MOUBARAK MOHAMED MISBAHOU MKOUBOI (1820705)
//section: 3

package assignments;

import java.util.*;

public class parsec {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in); 
		
			System.out.print("Enter a string: "); 
			
			String s = scan.nextLine(); 
			
			for(String x: s.split(" ")){ 
				
				System.out.println(x); 
				} 
			if(args.length==0){ 
				
				System.out.println("No command line arguments for main found.. "
						+ "\nPlease pass command line arguments to print line by line"); 
				} else{ 
					
					System.out.println("Command line arguments are:"); 
					
					for(int i = 0;i<args.length;i++){
						
						System.out.println(args[i]); } 
					} 
			
			scan.close();
			}
}

//https://www.journaldev.com/12552/public-static-void-main-string-args-java-main-method
//https://www.edureka.co/blog/command-line-arguments-in-java/