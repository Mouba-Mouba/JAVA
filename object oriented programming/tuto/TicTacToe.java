import java.util.*;

class Player{
	private String Name;
	private char Symbol;


	Player(String Name, char Symbol){
		this.Name = Name;
		this.Symbol = Symbol;
	}

	public void PlaceSymbol(Board b){
		boolean validPos = false;
		Scanner input = new Scanner(System.in);

		while(!validPos){
			System.out.print(this.Name + " ("+ this.Symbol + ") Pick a position to place your Symbol: ");
			int x = input.nextInt()-1;
			int y = input.nextInt()-1;
			if(b.CheckPos(x, y)){
				validPos = true;
				b.SetPos(x, y, this.Symbol);
			}
			else{
				System.out.println("This position is not valid, Please pick another one.");
			}
		}
	}

	public void setName(String name){
		this.Name = name;
	}

	public void setSymbol(char c){
		this.Symbol = c;
	}

	public String getName(){
		return Name;
	}

	public char getSymbol(){
		return Symbol;
	}
}


class Board{
	private char[][] Grid = new char[3][3];

	Board(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				Grid[i][j] = ' ';
			}
		}
	}

	public void printBoard(){
		// Print board
		System.out.println("   1 2 3");
		System.out.println("  -------");
		for(int i = 0; i < 3; i++){
			System.out.print(i+1 + " ");
			for(int j = 0; j < 3; j++){
				System.out.print("|" + Grid[i][j]);
			}
			System.out.println("|");
			System.out.println("  -------");
		}
	}

	public void SetPos(int x, int y, char Symbol){
		// Set value of this position to symbol
		Grid[x][y] = Symbol;
	}

	public boolean CheckPos(int x, int y){
		if(Grid[x][y] == ' ')
			return true;
		else
			return false;
	}

	public char[][] getGrid(){
		return Grid;
	}
}

public class TicTacToe{
	public static boolean CheckWin(Player p, Board b){
		// Check Rows
		char c = p.getSymbol();
		char[][] grid = b.getGrid();
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(grid[i][j] != c)
					break;
				if(j == 2)
					return true;
			}
		}

		// Check Columns
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(grid[j][i] != c)
					break;
				if(j == 2)
					return true;
			}
		}
		// Check Diagonals
		if(grid[0][0] == c && grid[1][1] == c && grid[2][2] == c )
			return true;

		if(grid[0][2] == c && grid[1][1] == c && grid[2][0] == c )
			return true;

		return false;
	}

	public static void main(String[] args){
		boolean GameOver = false;
		int moves = 0;

		Player p1 = new Player("Ahmed", 'O');
		Player p2 = new Player("Ali", 'X');

		Board b = new Board();
		b.printBoard();

		while(!GameOver){
			if(moves%2 == 0){
				// Player 1 play
				p1.PlaceSymbol(b);
				b.printBoard();
				moves += 1;
				if(CheckWin(p1, b)){
					System.out.println(p1.getName() + " Is the Winner!!");
					GameOver = true;
				}
			}else{
				// Player 2 play
				p2.PlaceSymbol(b);
				b.printBoard();
				moves += 1;
				if(CheckWin(p2, b)){
					System.out.println(p2.getName() + " Is the Winner!!");
					GameOver = true;
				}
			}
			if(moves == 9){
				System.out.println("The game ended in a Tie");
				GameOver = true;
			}
		}
	}
}