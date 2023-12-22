import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			d[i] = sc.nextInt();
			a[i] = 0;
		}
		if(d[0] == 0){
			Arrays.sort(d);
			if(d[1] == 1){
				int j = 0;
				for(int k = 0; k < n; k++){
					if(d[k] == j){
						a[j]++;
					}
					else{
						if(d[k] == j+1){
							a[j+1]++;
							j++;
						}
						else{
							System.out.print(0);
							break;
						}
					}
				}
				long ans = 1;
				for(int l = 1; l < n; l++){
					if(a[l] != 0){
						ans *= Math.pow(a[l-1], a[l]);
					}
					else{
						ans %= 998244353;
						System.out.print(ans);
						break;
					}
				}

			}
			else{
				System.out.print(0);
			}

		}
		else{
			System.out.print(0);
		}
	}

}