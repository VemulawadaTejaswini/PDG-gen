import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][]=new int[3][3];
		int ans[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=scan.nextInt();
				ans[i][j]=0;
			}
		}
		int n=scan.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			b[i]=scan.nextInt();
		}
		scan.close();

		for(int k=0;k<n;k++) {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if( a[i][j] == b[k]) {
						ans[i][j]=1;
					}
				}
			}
		}
		int check=0;
		for(int i=0;i<3;i++) {
			int cnt = 0;
			for(int j=0;j<3;j++) {
				cnt+=ans[i][j];
			}
			if(cnt == 3) {
				check=1;
				break;
			}
		}
		for(int i=0;i<3;i++) {
			int cnt = 0;
			for(int j=0;j<3;j++) {
				cnt+=ans[j][i];
			}
			if(cnt == 3) {
				check=1;
				break;
			}
		}
		int cnt=0;
		for(int j=0;j<3;j++) {
			cnt+=ans[j][j];
		}
		if(cnt == 3) {
			check=1;
		}
		cnt=0;
		for(int j=0;j<3;j++) {
			cnt+=ans[2-j][j];
		}
		if(cnt == 3) {
			check=1;
		}

		System.out.println((check==1)? "Yes":"No");
	}
}