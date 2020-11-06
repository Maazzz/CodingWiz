public class Question3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i,max=0,k=0;
		for(i=2;i<=1000000;i++) {
			if(colatz(i)> max) {
				max = colatz(i);
				k = i;
			}
		}
		System.out.println("Starting number which has the highest collatz sequence is: "+k);
	}
//Function to find the collatz sequence of any number and return the length of the sequence
	public static long colatz(long n) {
		int ctr=0;
		while(n!=1) {
			ctr++;
			if(n%2==0) {
				n=n/2;	
			}
			else {
				n= 3*n+1;
			}
		}
		return ctr;
	}

}
