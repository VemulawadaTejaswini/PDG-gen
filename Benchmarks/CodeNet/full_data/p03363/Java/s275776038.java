import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		long[] sum = new long[N + 1];
		sum[0] = 0;
		for(int i = 1; i <= N; i++) sum[i] += sum[i - 1] + sc.nextLong();
		Arrays.sort(sum);
		long cnt = 0;
		for(int i = 0; i < N + 1; i++) {
			long tmp = i;
			while(i + 1 < N + 1 && sum[i] == sum[i + 1]) i++;
			cnt += (i - tmp) * (i - tmp + 1) / 2;
		}
		System.out.println(cnt);
	}
}