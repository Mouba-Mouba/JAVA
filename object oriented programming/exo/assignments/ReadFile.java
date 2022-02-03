/* MOHAMED MOUBARAK MOHAMED MISBAHOU MKOUBOI(1820705)
 * SECTION 03
 */
package assignments;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("MohamedMoubarak1820705.txt");
      Scanner input = new Scanner(myObj);
      input = new Scanner(new File("MohamedMoubarak1820705.txt"));
      for(int i = 0; i < 50; i++) {
      	double number = input.nextInt();
      	System.out.println(number);
      }
      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("An error occurred.");
      ex.printStackTrace();
    }
  }
}