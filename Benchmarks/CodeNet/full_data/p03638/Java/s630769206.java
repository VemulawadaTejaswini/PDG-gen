import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++)a[i]=sc.nextInt();
		sc.close();
		
		int field[][]= new int[H][W];
		int nowH = 0;
		int nowW = 0;
		int color = 1;
		boolean goRight = true;
		for(int t:a) {
			for(int i=0;i<t;i++) {
				field[nowH][nowW]=color;
		
				if(goRight) {
					if(nowW<W-1) nowW ++;
					else {
						nowH++;
						goRight = false;
					}
				}
				else {
					if(nowW>0) nowW --;
					else {
						nowH++;
						goRight = true;
					}
				}
				
			}
			color ++ ;
		}
		
		//output
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				sb.append(field[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
