import java.util.Arrays;
import java.util.Scanner;

class Main {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long[] v = new long[N];
		for(int i=0; i<N; i++){
			v[i]  = sc.nextLong();
		}
		
		Arrays.sort(v);

		//最大値を調べるにはA個だけ選ぶ
		long max_sum = 0;
		for(int i=N-1; i>=N-A; i--){
			max_sum += v[i];
		}
		double max_ave = (double) max_sum / (double) A;
		System.out.println(max_ave);
		
		//選んだA個の中でv[N-A]と同じ値のものの個数
		int count1 = 1;
		long max_value = v[N-A];
		for(int i=N-A+1; i<N-1; i++){
			if(v[i]==max_value){
				count1++;
			}else{
				break;
			}
		}
		
		//vの中でv[N-A]と同じ値のものの個数
		int count2 = count1;
		for(int i=N-A-1; i>=0; i--){
			if(v[i]==max_value){
				count2++;
			}else{
				break;
			}
		}
		
		long count;
		int bunbo;
		int bunshi;
		bunbo = 1;
		bunshi = count2;
		count = bunshi;
		bunbo++;
		bunshi--;
		while(bunbo<=count1){
			count = count * bunshi / bunbo;
			bunbo++;
			bunshi--;
		}

		long[] c = new long[B+1];
		if(count1 == A){
			count = 0;
			bunbo = 1;
			bunshi = count2;
			c[0] = 1;
			for(int i=1; i<=Math.min(B,count2); i++){
				c[i] = c[i-1] * bunshi / bunbo;
				bunbo++;
				bunshi--;
			}
			for(int i=A; i<=Math.min(B,count2); i++){
				count += c[i];
			}
		}

		System.out.println(count);		
		
	}

}
