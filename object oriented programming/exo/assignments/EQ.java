// MOHAMED MOUBARAK MOHAMED MISBAHOU MKOUBOI (1820705)
//section: 3

package assignments;

public class EQ {

	public static void main(String[] args) {
		
		EQ board1 = new EQ();
		board1.set(0, 2);
		board1.set(1, 4);
		board1.set(2, 7);
		board1.set(3, 1);
		board1.set(4, 0);
		board1.set(5, 3);
		board1.set(6, 6);
		board1.set(7, 5);
		System.out.println("Is board 1 a correct eight queen placement?" + board1.isSolved());
		EQ board2 = new EQ(new int[] { 0, 4, 7, 5, 2, 6, 1, 3 });
		if (board2.isSolved()) {
		System.out.println("Eight queens are placed correctly "
		+ "in board 2");
		board2.printBoard();
		}
		else {
		System.out.println("Eight queens are placed incorrectly "
		+ "in board 2");
		   }
	}
		
		// A private data field queens of the type int[].
		private int[] queens = new int[8];
		
		//A no-arg constructor that constructs an object of EQ default queens values of -1s in the array.
		public EQ() {
			
			for (int i = 0; i < 8; i++) {
				
				queens[i] = -1;
			}
		}
		
		//A constructor named EQ(int[] queens) that constructs an object of EQ with the specified queen placement.
		public EQ(int[] queens) {
			
			this.queens = queens;
		}
		
		//A method named get(int i) that returns queens[i].
		public int get(int i) {
			
			return queens[i];
		}
		
		//A method named set(int i, int j) that sets queens[i] with j.
		public void set(int i, int j) {
			
			queens[i] = j;
		}
		
		//A method named isSolved() that returns true if all queens are placed in the board correctly.
		public boolean isSolved() {
		    
			//test column
			for(int row=0; row < queens.length; row++) {
					for (int col = row + 1 ; col <queens.length; col++) {
							if (get(row) == get(col))
								return false;
					}
			}
			
			//test down right diagonal
			for(int row=0; row < queens.length; row++) { 
					for (int col = row + 1, i=1 ; col <queens.length; col++, i++) {
							if (get(col) == get(row)+i)
								return false;
					}
			}
			
			//test down left diagonal
			for(int row=0; row < queens.length; row++) {
					for (int col = row + 1, i=1 ; col <queens.length; col++, i++) {
							if (get(col) == get(row)-i)
								return false;
					}
			}
			
			return true;
		}
		
		//A method named printBoard() that displays the board with the queens like the following:
		public void printBoard() {
			
			for (int row = 0; row <queens.length; row++) {
				for (int col = 0; col <queens.length; col++) {
					System.out.print("|");
					if (get(row) == col) 
					{
						System.out.print("X");
					}
					else 
					{
						System.out.print(" ");
					}
					
				}
				System.out.println("|");
		}
			
	 }

}


//https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/?ref=lbp
//https://stackoverflow.com/questions/4130640/solving-eight-queens-problem-with-2-d-array-indexoutofbounds-error
