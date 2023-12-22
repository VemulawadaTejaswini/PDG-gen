import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), x=sc.nextInt();
		int temp=0,ans=0;
		for(int i=0; i<=a;i++) {
			for(int j=0; j<=b; j++) {
				for(int k=0; k<=c; k++) {
					temp=(i*500)+(j*100)+(k*50);
					if(temp == x) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
