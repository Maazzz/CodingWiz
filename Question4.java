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
		y = Integer.parseInt(s.substring(s.lastIndexOf(" ")+1));
		if(month.equals("January")||month.equals(" January")) {
			m = 1;
			day = d;
		}
		else if(month.equals("February")||month.equals(" February")) {
			m = 2;
			day = d+31;
		}
		else if(month.equals("March")||month.equals(" March")) {
			if(leap(y)==1) {
				day = d+60;
			}
			else {
				day = d+59;
			}
			m = 3;
		}
		else if(month.equals("April")||month.equals(" April")) {
			if(leap(y)==1) {
				day = d+91;
			}
			else {
				day = d+90;
			}
			m = 4;
		}
		else if(month.equals("May")||month.equals(" May")) {
			if(leap(y)==1) {
				day = d+121;
			}
			else {
				day = d+120;
			}
			m = 5;
		}
		else if(month.equals("June")||month.equals(" June")) {
			if(leap(y)==1) {
				day = d+152;
			}
			else {
				day = d+151;
			}
			m = 6;
		}
		else if(month.equals("July")||month.equals(" July")) {
			if(leap(y)==1) {
				day = d+182;
			}
			else {
				day = d+181;
			}
			m = 7;
		}
		else if(month.equals("August")||month.equals(" August")) {
			if(leap(y)==1) {
				day = d+213;
			}
			else {
				day = d+212;
			}
			m = 8;
		}
		else if(month.equals("September")||month.equals(" September")) {
			if(leap(y)==1) {
				day = d+244;
			}
			else {
				day = d+243;
			}
			m = 9;
		}
		else if(month.equals("October")||month.equals(" October")) {
			if(leap(y)==1) {
				day = d+274;
			}
			else {
				day = d+273;
			}
			m = 10;
		}
		else if(month.equals("November")||month.equals(" November")) {
			if(leap(y)==1) {
				day = d+305;
			}
			else {
				day = d+304;
			}
			m = 11;
		}
		else if(month.equals("December")||month.equals(" December")) {
			if(leap(y)==1) {
				day = d+335;
			}
			else {
				day = d+334;
			}
			m = 12;
		}
		System.out.println("Day of the year is: "+day);
	}
	//Function to check if it is a leap year or not
	
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