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
		
		int count = 1;
		long max_value = v[N-A];
		for(int i=N-A-1; i>=0; i--){
			if(v[i]==max_value){
				count++;
			}else{
				break;
			}
		}
		System.out.println(count);
		
	}

}
