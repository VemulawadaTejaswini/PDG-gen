import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		int[] kk = new int[n];
		for(int i=0;i<n;i++) {
			h[i] = sc.nextInt();
			kk[i] = 0;
		}
		boolean f = true;
		for(int i=0;i<n-1;i++) {
			if(h[i+1]-h[i]>0) {
				h[i+1]--;
				kk[i+1]=1;
			}
			if(h[i]>h[i+1]) {
				if(h[i]-h[i+1]==1 && kk[i] ==0) {
					//OK
					kk[i+1]=1;
				}else {
					f=false;
					break;
				}
			}
			if(h[i]==h[i+1]) {
				kk[i+1]=1;
			}
		}
		if(f) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}