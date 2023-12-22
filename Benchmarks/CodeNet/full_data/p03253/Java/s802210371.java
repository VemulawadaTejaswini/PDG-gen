import java.util.Arrays;
import java.util.Scanner;

// D

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		int[] Mx = bunkai(M); // 出現回数格納用の配列
		long res = 1;

		for(int i = 0; i < Mx.length; i++){
			if(Mx[i] == 0){
				continue;
			}
			res *= Mx[i]*N;
		}

		System.out.println(res);
	}



	static int[] bunkai(int num) {
		int m = num;
		int[] b =  new int[100000];
		Arrays.fill(b, 0);

		    // 2 で割れるだけ割り算する
		    while (m % 2 == 0) {
		      b[2]++;
		      m /= 2;
		    }
		   // 奇数で割り算していく
		   for (int i = 3; i * i <= m; i += 2) {
		      while (m % i == 0) {
		      b[i]++;
		        m /= i;
		     }
		   }
		   if (m > 1){
		    	b[m]++;
		   }
	return b;
}
}
