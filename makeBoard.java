package tests;
									
import java.util.Scanner;   // input method

public class Main {
	public char[][] createBoard(int size) {   // method for creating the board
		char[][] board = new char[size][size];   // multi-d array
		
		for (int i = 0; i < board.length; i++) {    // first dim. loop
			for (int j = 0; j < board[i].length; j++) {   // sec dim. loop
				board[i][j] = 'O';
			}
		}
		
		return board;
	}
	
	public void printBoard(char[][] board) {   // method for printing board
		for (int i = 0; i < board.length; i++) {
			System.out.print(i + 1 + " ");   // column increments
			
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
				System.out.print((j == board[i].length - 1)? System.lineSeparator(): " ");   // line break after certain thresh.
			}
		}
		
		System.out.print("  ");
		
		for (int k = 0; k < board.length; k++) {   // row increments
			System.out.print(k + 1 + " ");
		}
	}
	
	public static void main(String[] args) {
		Main play = new Main();   // obj for class
		Scanner inp = new Scanner(System.in);
		int ans;
		
		System.out.print("Enter a number from 1 to 9: ");

		while (true) {   // error handling; flawed
			ans = inp.nextInt();
			
			if (1 <= ans && ans < 10) {
				break;
			}
			
			System.out.print("Try again: ");
		}
		
		play.printBoard(play.createBoard(ans));
		inp.close();
	}
}
