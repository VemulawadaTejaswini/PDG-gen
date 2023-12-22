import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flg = false;
		int n = sc.nextInt();
		long k = sc.nextLong();

		switch (n){
			case 1:
				long a =  sc.nextLong();
				if (a == k){
					flg = true;
				}
				break;

			case 2:
				long a1 =  sc.nextLong();
				long a2 =  sc.nextLong();
				if (a1 == k){
					flg = true;
				}else if (a2 == k){
					flg = true;
				}else{
					long sa1 = Math.abs(a1-a2);
					if(sa1 >= k ){
						flg = true;
					}
				}
				break;

			default:
				long[] a3 = new long[n];

				for (int i=0; i < n; i++){
					a3[i] = sc.nextLong();
				}

				for (int i=0; i < n; i++){
					if (a3[i] == k){
						 flg = true;
					}
				}

				if (!flg){
					Arrays.sort(a3);
					if(a3[n-1] > k){
						long sa2 = a3[n-1] - a3[0];

						if (sa2 >= a3[n-2]){
							if ( k > sa2){
								flg = true;
							}
						}
					}
				}
				break;
		}



		if (flg){
			System.out.println("POSSIBLE");
		}else{
			System.out.println("IMPOSSIBLE");
		}

		sc.close();
	}

}