import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int x = scan.nextInt();
			int[]a = new int[N];
			for(int i = 0;i<N;i++)a[i] = scan.nextInt();
			
			long goukei = 0;
			
			for(int i = 0;i<N-1;i++) {
				if(a[i]==0&&a[i+1]==0)continue;
				if(a[i]==0&&a[i+1]>x) {
					goukei+=a[i+1]-x;
					a[i+1] = x;
				}else if(a[i+1]==0&&a[i]>x) {
					goukei+=a[i]-x;
					a[i] = x;
				}else if(a[i]+a[i+1]>x) {
					int h = a[i]+a[i+1]-x;
					if(a[i+1]>=h) {
						goukei+=h;
						a[i+1]-=h;
					}else {
						goukei+=a[i+1];
						h-=a[i+1];
						a[i+1]=0;
						goukei+=h;
						a[i]-=h;
					}
				}
			}
			
			for(int i = 0;i<N;i++) {
				//System.out.print(a[i]+" ");
			}
			
			System.out.println(goukei);
			
			
			
		}
		
		
	}
		

}
