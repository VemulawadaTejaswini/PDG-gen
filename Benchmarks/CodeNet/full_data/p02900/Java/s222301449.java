import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int max=max(A,B);
		int cnt=0;
		int sqmax=(int)Math.sqrt(max);
		for(int i=1;i<=sqmax;i++) {
			if(max%i==0) {
				int j=max/i;
				if(sosu(i)) {
					cnt++;
				}
				if(i!=j&&sosu(j)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	public static boolean sosu(int a) {
		int x=(int)Math.sqrt(a);
		for(int i=2;i<=x;i++) {
			if(a%i==0) {
				return false;
			}
		}

		return true;
	}
	public static int max(int a,int b) {
		int x=(int)Math.sqrt(a);
		for(int i=1;i<=x;i++) {
			if(a%i==0) {
				i=a/i;
				if(b%i==0) {
					return i;
				}
				i=a/i;
			}
		}
		for(int i=x;i>0;i--) {
			if(a%i==0) {
				//x=a/x;
				if(b%i==0) {
					return i;
				}
				//x=a/x;
			}
		}
		return 1;
	}

}