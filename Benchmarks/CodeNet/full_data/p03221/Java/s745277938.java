import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] py = new int[m][3];
		for(int i = 0; i < m; i++){
			py[i][0] = i;
			py[i][1] = sc.nextInt();
			py[i][2] = sc.nextInt();
		}
		int[] cou = new int[100001];
		Arrays.sort(py,(a,b)->Integer.compare(a[2],b[2]));
		for(int i = 0; i < m; i++){
			cou[py[i][1]]++;
			py[i][2] = cou[py[i][1]];
		}
		Arrays.sort(py,(a,b)->Integer.compare(a[0],b[0]));
		for(int i = 0; i < m; i++){
			System.out.printf("%06d",py[i][1]);
			System.out.printf("%06d\n",py[i][2]);
		}
	}
}
