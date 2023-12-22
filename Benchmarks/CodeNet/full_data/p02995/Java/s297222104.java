import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
		long D=sc.nextLong();

		long ans_sum=B-A+1;
		long ans_div_c=B/C-A/C;
		long ans_div_d=B/D-A/D;
		long cd=C*D/gcd(C,D);
		long ans_div_cd=B/cd-A/cd;
		if (A%C==0) {
			ans_div_c+=1;
		}
		if (A%D==0) {
			ans_div_d+=1;
		}
		if (A%cd==0) {
			ans_div_cd+=1;
		}
		System.out.println(ans_sum-ans_div_c-ans_div_d+ans_div_cd);
	}

	static long gcd(long a,long b) {
	    long temp;
	    while ((temp=a%b)!=0) {
	        a=b;
	        b=temp;
	    }
	    return b;
	}
}