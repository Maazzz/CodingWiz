import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d,m=0,y,day=0;
		System.out.println("Enter a date: ");
		String s = sc.nextLine();
		int len = s.length();
		d = Integer.parseInt(s.substring(0, s.indexOf(" ")));
		String month = s.substring(s.indexOf("h")+2, s.lastIndexOf(" "));
		month = s.substring(s.indexOf("d")+2, s.lastIndexOf(" "));
		month = s.substring(s.indexOf("t")+2, s.lastIndexOf(" "));
		if(month.equals("January")||month.equals(" January")) {
			m = 1;
		}
		else if(month.equals("February")||month.equals(" February")) {
			m = 2;
		}
		else if(month.equals("March")||month.equals("  March")) {
			m = 3;
		}
		else if(month.equals("April")||month.equals(" April")) {
			m = 4;
		}
		else if(month.equals("May")||month.equals(" May")) {
			m = 5;
		}
		else if(month.equals("June")||month.equals(" June")) {
			m = 6;
		}
		else if(month.equals("July")||month.equals(" July")) {
			m = 7;
		}
		else if(month.equals("August")||month.equals(" August")) {
			m = 8;
		}
		else if(month.equals("September")||month.equals(" September")) {
			m = 9;
		}
		else if(month.equals("October")||month.equals(" October")) {
			m = 10;
		}
		else if(month.equals("November")||month.equals(" November")) {
			m = 11;
		}
		else if(month.equals("December")||month.equals(" December")) {
			m = 12;
		}
		y = Integer.parseInt(s.substring(s.lastIndexOf(" ")+1));
		if(m == 1) {
			day = d;
		}
		if(leap(y)==1) {
			if(m == 2) {
				if(d > 29) {
					System.out.println("February only has 29 days");
				}
				else {
					day = d+31;
				}
			}
			if(m == 3) {
				if(d > 31) {
					System.out.println("March only has 31 days");
				}
				else {
					day = d+60;
				}
			}
			if(m == 4) {
				if(d > 30) {
					System.out.println("April only has 30 days");
				}
				else {
					day = d+91;
				}
			}
			if(m == 5) {
				if(d > 31) {
					System.out.println("May only has 31 days");
				}
				else {
					day = d+121;
				}
			}
			if(m == 6) {
				if(d > 30) {
					System.out.println("June only has 30 days");
				}
				else {
					day = d+152;
				}
			}
			if(m == 7) {
				if(d > 31) {
					System.out.println("July only has 31 days");
				}
				else {
					day = d+182;
				}
			}
			if(m == 8) {
				if(d > 31) {
					System.out.println("August only has 31 days");
				}
				else {
					day = d+213;
				}
			}
			if(m == 9) {
				if(d > 30) {
					System.out.println("September only has 30 days");
				}
				else {
					day = d+244;
				}
			}
			if(m == 10) {
				if(d > 31) {
					System.out.println("October only has 31 days");
				}
				else {
					day = d+274;
				}
			}
			if(m == 11) {
				if(d > 30) {
					System.out.println("November only has 30 days");
				}
				else {
					day = d+305;
				}
			}
			if(m == 12) {
				if(d > 31) {
					System.out.println("December only has 31 days");
				}
				else {
					day = d+335;
				}
			}
		}
		else {
			if(m == 2) {
				if(d > 28) {
					System.out.println("February only has 28 days");
				}
				else {
					day = d+31;
				}
			}
			if(m == 3) {
				if(d > 31) {
					System.out.println("March only has 31 days");
				}
				else {
					day = d+59;
				}
			}
			if(m == 4) {
				if(d > 30) {
					System.out.println("April only has 30 days");
				}
				else {
					day = d+90;
				}
			}
			if(m == 5) {
				if(d > 31) {
					System.out.println("May only has 31 days");
				}
				else {
					day = d+120;
				}
			}
			if(m == 6) {
				if(d > 30) {
					System.out.println("June only has 30 days");
				}
				else {
					day = d+151;
				}
			}
			if(m == 7) {
				if(d > 31) {
					System.out.println("July only has 31 days");
				}
				else {
					day = d+181;
				}
			}
			if(m == 8) {
				if(d > 31) {
					System.out.println("August only has 31 days");
				}
				else {
					day = d+212;
				}
			}
			if(m == 9) {
				if(d > 30) {
					System.out.println("September only has 30 days");
				}
				else {
					day = d+243;
				}
			}
			if(m == 10) {
				if(d > 31) {
					System.out.println("October only has 31 days");
				}
				else {
					day = d+273;
				}
			}
			if(m == 11) {
				if(d > 30) {
					System.out.println("November only has 30 days");
				}
				else {
					day = d+304;
				}
			}
			if(m == 12) {
				if(d > 31) {
					System.out.println("December only has 31 days");
				}
				else {
					day = d+334;
				}
			}
		}
		System.out.println("Day of the year is: "+day);
	}
	//Function to check if the year is a leap year or not
	public static int leap(int y) {
		int bin;
		if(y%4 == 0) {
			bin=1;
		}
		else if(y%100==0 && y%400==0) {
			bin=1;
		}
		else {
			bin=0;
		}
		return bin;
	}
}
