import java.util.Scanner;

public class Main{
	

	private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt(),R=sc.nextInt();
		int min1=(L*R)%2019;
		int index1=0;
		int min2=(L*R)%2019;
		int index2=0;
		for(int i=L;i<=R;i++) {
			boolean flag=true;
			if(i%2019<min1) {
				min1=i%2019;
				flag=false;
			}
			if(i%2019<min2&&flag==true) {
				min2=i%2019;
			}
			
		}
		System.out.println(min1*min2);
	
		
		
		
		
		
		
		
		
		
	
		
		
}
}
