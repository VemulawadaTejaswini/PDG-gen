import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long K = scan.nextLong();
		int N = scan.nextInt();
		long [] house = new long[N];
		long way = 0;
		long ans = 0;

		for (int i = 0; i < N; i++){
			house[i] = scan.nextLong();
		}

		long second_way = 0;
		for(int i = 0; i < N; i++){
			way = house[(i + (N-1)) % N] - house[i];
			if(way <= 0){
				way = (K - house[i]) + house[(i + (N-1)) % N];
			}
			second_way = house[i] + (K - house[(i+1) % N]);
			if(second_way >= K){
				second_way = house[i] - house[(i+1) % N];
 			}

			if(i ==0 || ans > Math.min(way, second_way)){
				ans = Math.min(way, second_way);
			}

		}
		System.out.println(ans);


	}
}