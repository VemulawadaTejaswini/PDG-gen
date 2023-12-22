
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int prev=0,max=1,a=0,first=0,half1=0,half2=0;
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			if(i==n/2+1&&n>3) {
				half1=a;
				a=arr[i];
			}
			if(i>=1) {
				a=gcd(a,arr[i]);
			}else {
				a=arr[0];
			}
			//System.out.println(a+" ammam ");
			
		}
		if(n==3) {
			a=Math.max(Math.max(gcd(arr[0],arr[1]),gcd(arr[1],arr[2])),gcd(arr[0],arr[2]));
		}
		if(half1==a) {
			System.out.println(a);
		}else {
			int cnt=0;
			//System.out.println(half1+" hmhmhmhm "+a);
			if(half1>a) {
				for(int i=n/2+1;i<n;i++) {
					if(gcd(half1,arr[i])!=half1) {
						cnt++;
					}
				}
				if(cnt==1) {
					System.out.println(half1);
				}else {
					System.out.println(gcd(a,half1));
				}
			}else {
				cnt=0;
				for(int i=0;i<=n/2;i++) {
					if(gcd(a,arr[i])!=a) {
						cnt++;
					}
				}
				if(cnt==1) {
					System.out.println(a);
				}else {
					System.out.println(gcd(a,half1));
				}
			}
		}
		
	}
	public static int gcd(int a,int b) {
		//System.out.println(a+" "+b);
		if(a==0) {
			//System.out.println(b+" b");
			return b;
		}
		return gcd(b%a,a);
	}
}
