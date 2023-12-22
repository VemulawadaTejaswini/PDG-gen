import java.util.Scanner;

public class Main {

	public static int n;
	public static int a[];
	public static int b[];
	public static int c[];
	public static int k[];
	public static boolean isC[][];
	public static boolean isK[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n-1];
		b=new int[n-1];
		c=new int[n];	//	頂点nのに連結する頂点数
		k=new int[n];	//	頂点nの子孫の持つアンテナ数
		isK=new boolean[n];
		isC=new boolean[n][n];
		for(int i=0;i<n-1;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			isC[a[i]][b[i]]=true;
			isC[b[i]][a[i]]=true;
			c[a[i]]++;
			c[b[i]]++;
		}
		for(int i=0;i<n;i++) {
			k[i]=Math.max(0, c[i]-2);
			isK[i]=(k[i]>0);
		}
		int ans=1;
		countk(0,-1);
	
		for(int i=0;i<n;i++) {
			ans+=Math.max(0, k[i]);
		}
		System.out.println(ans);
	}
	public static void countk(int j,int p) {//p:親
		for(int i=0;i<n;i++) {
			if(isC[j][i]&&i!=p) {
				countk(i,j);
				if(isK[i]) {
					k[j]--;
					isK[j]=true;
				}
			}
		}

	}

	}
