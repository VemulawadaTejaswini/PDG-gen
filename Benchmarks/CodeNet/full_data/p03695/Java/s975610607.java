import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int[] a = new int[N];
		int cnt =0;
		boolean[] used = new boolean[8];

		for(int i=0;i<N;i++){
			a[i]=scan.nextInt();
			if(a[i]>=3200){
				cnt++;
			}else{
				used[a[i]/400]=true;
			}
		}


		int max=0;
		int min=0;
		for(int i=0;i<8;i++){
			if(used[i]){
				max++;
				min++;
			}
		}
//		max = Math.min(8, max+cnt);
		max = max+cnt;
		min = Math.max(1, min);
		System.out.println(min+" "+max);
	}

}
