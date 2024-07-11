package mypack;

public class Pack {
	public static boolean ispalindrome(int n) {
		int newnum=0;
		int rem=0;
		int num=n;
		while(n!=0) {
			rem=n%10;
			n/=10;
			newnum=newnum*10+rem;
		}
		
		if(num==newnum) {
	return true;
		}
		else
			return false;
	}


}
