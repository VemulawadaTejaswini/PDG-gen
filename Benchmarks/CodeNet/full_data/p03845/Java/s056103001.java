import java.util.Scanner;

class Main{




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		
		int[] t = new int[n+1];
		for(int i = 1;i <= n;i++){
			t[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] p = new int[m+1];
		int[] x = new int[m+1];

		for(int i = 1;i <= m;i++){
			p[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}

		for(int i = 1;i <= m;i++){
			int ans =0;

			for(int j = 1;j <= n;j++){
				if(j != p[i]){
					ans += t[j];
				}else{
					ans += x[i];
				}
			}
			System.out.println(ans);

		}



	}
}

class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


