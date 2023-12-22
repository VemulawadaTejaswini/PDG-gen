import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] buff = new int[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		buff = a.clone();
		Arrays.sort(buff);
		int max = buff[N-1];
		int min = buff[N-2];

		for(int i=0;i<N;i++) {
			buff = a.clone();
			if(buff[i] == max) {
				System.out.println(min);
			}else {
				System.out.println(max);
			}
		}


	}
}