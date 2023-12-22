import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0;i < n;i++){
			h[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0;i < n;i++){
			boolean vail = true;
			for(int j = 0;j < i;j++){
				if(h[j] > h[i]){
					vail = false;
					break;
				}
			}
			if(vail){
				ans++;
			}
		}
		
		System.out.print(ans);
	}
	


}


class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}


