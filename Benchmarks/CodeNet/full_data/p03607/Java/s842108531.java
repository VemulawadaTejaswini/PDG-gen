import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int cnt = 0;
		for(int i=0;i<N;i++){
			A[i] = sc.nextInt();
		}
		sort(A);
		int pre = A[0];
		cnt++;
		for(int i=1;i<N;i++){
			if(A[i] == pre){
				cnt--;
			}else{
				pre = A[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	static void sort(int[] d){
		for(int i=0;i<d.length;i++){
			for(int j=d.length-1;j>i;j--){
				if(d[i] > d[j]){
					int swap = d[i];
					d[i] = d[j];
					d[j] = swap;
				}
			}
		}
	}
}
