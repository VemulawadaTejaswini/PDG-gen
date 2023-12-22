import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k[] =new int[n];
		int a[][]=new int [n][m];
		for(int i=0;i<n;i++) {
			k[i]=scan.nextInt();
			for(int j=0;j<k[i];j++) {
				a[i][j]=scan.nextInt();
			}
		}
		scan.close();
		int cnt=0;
		int check[]=new int[m];
		for(int i=0;i<m;i++) {
			check[i]=0;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<k[i];j++) {
				int num=a[i][j]-1;
				check[num]+=1;
			}
		}
		for(int i=0;i<m;i++) {
			if(check[i] == n)cnt++;
		}
		System.out.println(cnt);
	}
}