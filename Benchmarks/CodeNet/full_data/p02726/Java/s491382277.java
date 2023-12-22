import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	public static void main(String[] args) {
		int n =sc.nextInt();
		int x =sc.nextInt();
		int y =sc.nextInt();
		int ans[]=new int[n+1];
		int max=0;
		int k1;
		int k2;
		for(int i=1;i!=n;i++) {
		for(int j=i+1;j<n+1;j++) {
			k1=j-i;
			k2=Math.abs(x-i)+1+Math.abs(y-j);
			if(k1>k2) {
				max=k2;
			}else if(k1<k2) {
				max=k1;
			}else if(k1==k2){
				max=k1;
			}
			ans[max]++;
			
		//p(ans);
		}
		}
		for(int i=1;i!=n;i++) {
			p(ans[i]);
		}
		
		
			
		
		
		
		
	}
}
