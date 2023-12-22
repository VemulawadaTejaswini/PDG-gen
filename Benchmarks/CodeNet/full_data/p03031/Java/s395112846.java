import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[] count = new int[m], bit=new int[m];
		int[][] array = new int[m][n];
		for(int i=0;i<m;i++) {
			count[i]=sc.nextInt();
			for(int j=0;j<count[i];j++) array[i][j]=sc.nextInt()-1;
		}
		for(int i=0;i<m;i++) bit[i]=sc.nextInt();
		sc.close();
		int cnt=0;
		for(int i=0;i<(1<<n);i++) {
			int flag=0;
			for(int j=0;j<m;j++) {
				int c=0;
				for(int k=0;k<count[j];k++) {
					if((i&(1<<array[j][k]))!=0) {
						c++;
					}
				}
				if(c%2!=bit[j]) {
					flag=1;
					break;
				}
			}
			if(flag==0) cnt++;
		}
		System.out.println(cnt);
	}
}