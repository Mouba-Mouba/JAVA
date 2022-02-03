/* MOHAMED MOUBARAK MOHAMED MISBAHOU MKOUBOI(1820705)
 * SECTION 03
 */
package assignments;

import java.util.*;

public class cartons {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int NofHikersBags = 0;
		int carton = 0;
		int limite = 5000;
		int num, vol;
		int charged = 0;
		
		//taking the number of hikers
		System.out.println("Enter the number of hikers and the bags volume of each one: ");
	    num = input.nextInt();
	    for(int i = 0; i<num; i++) {
	    	
	    	// taking the volume of each hiker' bag
	    	System.out.println("the bag volume of H"+(i+1)+" is:" );
	    	vol = input.nextInt();
	    	if (vol <= limite) {
	    		carton ++;
	    	}else{
	    		System.out.println("sorry you have more kilos, so will charged to you accordingly");
	    		charged++;
	    	}
	    	NofHikersBags++;
	    }
	    
	    //display the free bags taken and their contents 
	    System.out.println("\nthe number of cartons is " + carton +  " and their respective contents are: " + NofHikersBags + " bags and "
	    		+ charged + " has to be charged accordingly");
	    
	    input.close();
	}

}
