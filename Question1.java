import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String r="",s = sc.nextLine();
		int i,len = s.length();
		s = s.toUpperCase();
		for (i=len-len;i<len;i++) {
			char ch = s.charAt(i);
			switch(ch) {
			case 'G':
				r = r + 'C';
				break;
			case 'C':
				r = r + 'G';
				break;
			case 'T':
				r = r + 'A';
				break;
			case 'A':
				r = r + 'U';
				break;
			default :
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		System.out.println(r);
	}
}