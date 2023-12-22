import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();

		int[] V = new int[n];

		for(int i=0;i<n;i++){
			V[i] = sc.nextInt();
		}

		int sum = 0;

		for(int i=0;i<n;i++){
			int vi = V[i];
			int ci = sc.nextInt();
			if(vi>ci)sum = sum + vi -ci;
		}

		// 出力
		System.out.println(sum);
	}
}