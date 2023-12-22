import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[]a = new int[n + 1];
		int[]b = new int[n + 1];
		int[]c = new int[m + 1];
		int[]d = new int[m + 1];

		for(int i = 1;i < n+1;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for(int i = 1;i < m+1;i++){
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		
		int ans[] = new int[n+1];
		
		for(int i = 1;i < n+1;i++){
			int dis = 1000000000;
			int minnum = 0;
			for(int j = 1; j < m+1;j++){
				if( (Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j])) < dis){
					dis = Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]);
					minnum = j;
				}
			}
			
			ans[i] = minnum;			
		}
		
		for(int i = 1;i < n+1;i++){
			System.out.println(ans[i]);
		}
		
		
		
		
		
	}
}

class Pair implements Comparable{
	Character from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


