import java.util.*;
public class Question2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String c,s;
		int ctr1=0,ctr2=0,i;
		//creating random values for computer
		int r = (int)(Math.random()*3)+1;
		if (r == 1) {
			c = "R";
		}
		else if (r == 2) {
			c = "P";
		}
		else {
			c = "S";
		}
		for (i =1; i<=3;i++) {
			System.out.println("Enter user's choice 'R' for Rock, 'P' for Paper ,"
					+" 'S' for Scissor");
			s = sc.nextLine();			
			System.out.println("User's Input: "+s);
			System.out.println("Computer's Input: "+c);
			if (s.equals(c)) {
				System.out.println("Round tied");
				}
			else if (s.equals("P") && c.equals("R")) {
				ctr1++;
				System.out.println("User wins this round");
				}
			else if (s.equals("S") && c.equals("P")) {
				ctr1++;
				System.out.println("User wins this round");
			}
			else if (s.equals("R") && c.equals("S")) {
				ctr1++;
				System.out.println("User wins this round");
			}
			else if (s.equals("P") && c.equals("S")) {
				ctr2++;
				System.out.println("Computer wins this round");
				}
			else if(s.equals("S") && c.equals("R")) {
				ctr2++;
				System.out.println("Computer wins this round");
			}
			else if(s.equals("R") && c.equals("P")) {
				ctr2++;
				System.out.println("Computer wins this round");
			}
		}
		if(ctr1 == ctr2) {
			System.out.println("Game is tied");
		}
		else if(ctr1>ctr2) {
			System.out.println("User wins the Game");
		}
		else {
			System.out.println("Computer wins the Game");
		}
	}
}