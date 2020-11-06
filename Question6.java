public class Question6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i,ctr=0;
		for(i=1;i>=1;i++) {
			primen(i);
			if(primen(i)== true) {
				ctr++;
			}
			if(ctr == 10001) {
				System.out.println(i);
				break;
				}
			}
		}
//Function to check if a number if prime or not
	public static boolean primen(long n) {
		long i,temp=0,ctr=0;
		boolean prime;
		for(i=1;i<=n;i++) {
			temp = n%i;
			if(temp == 0) {
				ctr++;
				}
			}
		if(ctr==2) {
			prime = true;
			}
		else {
			prime= false;
			}
		return prime;
	}
}
