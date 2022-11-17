import java.util.Scanner;

class Guesser{
	int guessNum;
	
	
	int guessNum() {
		Scanner s = new Scanner(System.in);
		System.out.println("guesser: guess the number");
		guessNum = s.nextInt();
		return guessNum;
	}
	
}

class Players{
	int count;
	int guessNum;
	Players(int count){
		this.count=count;
	}
	
	
	int guessNum() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("player "+count +" : guess the number");
		guessNum = s.nextInt();
		return guessNum;
	}
	
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void numFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}
	
	void numFromPlayer() {
		Players p1 = new Players(1);
		Players p2 = new Players(2);
		Players p3 = new Players(3);
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
			
		
	}
	
	void Descision() {
		if(numFromGuesser==numFromPlayer1) {
			if(numFromGuesser==numFromPlayer2 &&numFromGuesser==numFromPlayer3) {
				System.out.println("all 3 player won the game");
			}else if(numFromGuesser==numFromPlayer2) {
				System.out.println("player 1 and palyer 2 won the game");
			}else if(numFromGuesser==numFromPlayer3) {
				System.out.println("player1 and player 3 won the game");
			}else {
				System.out.println("player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2) {
			if(numFromGuesser==numFromPlayer3) {
				System.out.println("player 2 and player 3 won the game");
			}else {
				System.out.println("player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3) {
			System.out.println("player 3 won the game");
		}
		else
			System.out.println("nobody won the game");
	}
	
}


public class GuesserGame{
	public static void main(String[] args) {
		
		Umpire u = new Umpire();
		u.numFromGuesser();
		u.numFromPlayer();
		u.Descision();
		
		
		
	}
		
}
