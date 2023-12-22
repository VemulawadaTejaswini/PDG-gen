import java.util.*;
public class Main {
	public static int gcd(int m, int n) {
        int r;
        while (n > 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
	public static int gcd(int m, int n,int p) {
		int r=gcd(m,n);
		return gcd(r,p);
       
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int t=0;
		for(int i=1;i<=c;i++) {
			for(int j=1;j<=c;j++) {
				for(int k=1;k<=c;k++) {
				t+=gcd(i,j,k);	
				}
			}
			
		}
		System.out.println(t);


	}

}
