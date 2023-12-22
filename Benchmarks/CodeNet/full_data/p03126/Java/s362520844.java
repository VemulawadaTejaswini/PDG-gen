import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[] like = new int[m];
		int ans=0;

		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			for(int j=0;j<k;j++) {
				int num = sc.nextInt();
				like[num-1]+=1;
			}
		}

		for(int a : like) {
			if(a==n) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}