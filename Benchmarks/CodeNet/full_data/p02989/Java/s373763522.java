import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dif = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++){
			dif[i] = sc.nextInt();
			if(max < dif[i]){
				max = dif[i];
			}
		}
		int res =0 ;
		for(int i = 0; i <= max; i++){
			int k = 0,l = 0;
			for(int j = 0; j < dif.length; j++){
				if(dif[j] >= i){
					k ++;
				}else{
					l ++;
				}
			}
			if(l==k){
				res ++;
			}
		}
		System.out.println(res);
	}
}