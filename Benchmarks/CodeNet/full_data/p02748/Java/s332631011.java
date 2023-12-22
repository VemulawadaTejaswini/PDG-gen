import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int na=sc.nextInt(),nb=sc.nextInt(),nm=sc.nextInt();
		int[] a=new int[na];
		int[] b=new int[nb];
		int[][] m=new int[nm][3];
		
		for(int i=0;i<na;i++)a[i]=sc.nextInt();
		for(int i=0;i<nb;i++)b[i]=sc.nextInt();
		for(int i=0;i<nm;i++) {
			for(int j=0;j<3;j++) {
				m[i][j]=sc.nextInt();
			}
		}
		
		int[] buffa=new int[na];
		int[] buffb=new int[nb];
		buffa=a;
		buffb=b;
		Arrays.sort(buffa);
		Arrays.sort(buffb);
		int min=buffa[0]+buffb[0];
		for(int i=0;i<nm;i++) {
			int x=m[i][0]-1,y=m[i][1]-1,c=m[i][2];
			min=Math.min(min, a[x]+b[y]-c);
		}
		System.out.println(min);
	}
}
