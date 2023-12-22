import java.util.*;

public class Main {
	
	private static void printbit(int n) {
		for(int i=0;i<5;i++) {
			int bit=n%2;
			System.out.print(bit);
			n=n>>1;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[] k = new int[m];
		int[][] s = new int[m][n];
		int[] p = new int[m];
		
		for(int i=0;i<m;i++) {
			k[i] = sc.nextInt();
			for(int j=0;j<k[i];j++) {
				s[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			p[i]=sc.nextInt();
		}
		
		int ans = 0;
		
		for(int i=0;i<Math.pow(2, n);i++) {//スイッチのパターンごと
			int temps[] = new int[n];
			int temp = i;
			for(int j=0;j<n;j++) {
				if(temp%2==1) {
					temps[j]=1;
					temp=temp>>1;
				}else {
					temps[j]=0;
					temp=temp>>1;
				}
			}
			/*
			System.out.print("temps ");
			for(int q=0;q<n;q++)System.out.print(temps[q]);
			System.out.println();
			System.out.print("    i ");
			printbit(i);
			System.out.println();
			*/
			
			int on=0;
			for(int j=0;j<m;j++) {//各電球
				int sum=0;
				for(int l=0;l<k[j];l++) {
					
					sum+=temps[s[j][l]-1];
				}
				if(sum%2==p[j]) {
					on++;
				}
			}
			if(on==m) {
				ans++;
				//printbit(i);
			}
			
		}
		
		
		
		System.out.println(ans);
		
		
	}

}
