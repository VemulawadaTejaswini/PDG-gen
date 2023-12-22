import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int Y=sc.nextInt();
		int ans1=-1;
		int ans2=-1;
		int ans3=-1;
		
		for(int i=0;i<=N;i++) {
			for(int j=0;j<=N;j++) {
				if(i+j<=N) {
					int otosidama=(10000*i)+(5000*j)+1000*(N-i-j);
					if(otosidama==Y) {
						ans1=i;
						ans2=j;
						ans3=N-i-j;
						break;
					}
				}
			}
		}

		System.out.println(ans1+" "+ans2+" "+ans3);

		sc.close();
	}
}
