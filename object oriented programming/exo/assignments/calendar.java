/* MOHAMED MOUBARAK MOHAMED MISBAHOU MKOUBOI(1820705)
 * SECTION 03
 */
package assignments;

import java.util.Scanner;

public class calendar {

	    public static int day(int month, int day, int year) {
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }

	    // return true if the given year is a leap year
	    public static boolean isLeapYear(int year) {
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int month = 11;   // month (Jan = 1, Dec = 12)
	        int year = 1982;     // year

	        // months[i] = name of month i
		       String monthName = "";
		       switch (month) {
		         case 1: monthName = "January,"; break;
		         case 2: monthName = "February,"; break;
		         case 3: monthName = "March,"; break;
		         case 4: monthName = "April,"; break;
		         case 5: monthName = "May,"; break;
		         case 6: monthName = "June,"; break;
		         case 7: monthName = "July,"; break;
		         case 8: monthName = "August,"; break;
		         case 9: monthName = "September,"; break;
		         case 10: monthName = "October,"; break;
		         case 11: monthName = "November,"; break;
		         case 12: monthName = "December,";
		       }

	        int[] days =  {
	                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	        };
			// check for leap year
	        if (month == 2 && isLeapYear(year)) days[month] = 29;


	        // print calendar header
	        System.out.println("------------------------------------");
	        System.out.println("   Mohamed Moubarak 1820705 Calendar");
	        System.out.println("------------------------------------");
	        String[] months = {
	                "",                              
	                "January", "February", "March",
	                "April", "May", "June",
	                "July", "August", "September",
	                "October", "November", "December"};
			System.out.println("        " + months[month] + " " + year);
	        System.out.println("------------------------------------");
	        System.out.println(" |Sun|Mon|Tue|Wed|Thu|Fri|Sat");
	        

	        // starting day
	        int d = day(month, 1, year);

	        // print the calendar
	        for (int i = 0; i < d; i++)
	            System.out.print("    ");
	        for (int i = 1; i <= days[month]; i++) {
	            System.out.printf(" |%2d", i);
	            if (((i + d) % 7 == 0) || (i == days[month])) 
	            System.out.println();
	        }
	        System.out.println("------------------------------------");
	        
	        input.close();
	        
	        input.close();
	}
}
