import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		char[][] a = new char[h][w];
		String s = sc.nextLine();
		boolean[][] first = new boolean[h][w];
		for(int i=0;i<h;i++)Arrays.fill(first[i], false);
		for(int i=0;i<h;i++){
			s = sc.nextLine();
			for(int j=0;j<w;j++){
				a[i][j] = s.charAt(j);
				if(a[i][j] == 'S'){
					first[i][j] = true;
				}
			}
		}
		sc.close();

		for(int i=0;i<k;i++){
			for(int j=0;j<h;j++){
				for(int l=0;l<w;l++){
					if(first[j][l]){
						if(j>0&&a[j-1][l]=='.') first[j-1][l] = true;
						if(j<h-1&&a[j+1][l]=='.') first[j+1][l] = true;
						if(l>0&&a[j][l-1]=='.') first[j][l-1] = true;
						if(l<w-1&&a[j][l+1]=='.') first[j][l+1] = true;
					}
				}
			}
		}
		int minscore = Math.max(h, w);
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				//System.out.print(first[i][j]?1:0);
				if(first[i][j]){
					int cx = Math.min(i, h-i);
					int cy = Math.min(j, w-j);
					int cscore = Math.min(cx, cy);
					minscore = Math.min(cscore, minscore);
				}
			}
			//System.out.println();
		}
		//System.out.println(minscore);
		int ans = 1;
		ans += (minscore+k-1)/k;
		System.out.println(ans);
	}

}