public class Question5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0,i,ctr=0,max=0;
		for(i=999;i>=100;i--) {
			for(int j=i;j>=100;j--) {
				p = i*j;
				if(p == reverse(p)) {
					if(p>max) {
						max = p;
					}
				}
			}
		}
		System.out.println("Largest palindrome made from the product of 3 digit number: "+max);
	}
	//Function to find reverse of a number
	public static int reverse(int n) {
		int rev = 0;
		while(n != 0) { 
			rev = rev * 10;
			rev = rev + n%10;
			n = n/10;
			}
		return rev;
	}
}