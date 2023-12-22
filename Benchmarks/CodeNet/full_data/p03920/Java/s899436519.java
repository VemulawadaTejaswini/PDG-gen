import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int a = 5000100;
		long[] arr = new long[5000];
		for(int i = 0; i < 5000; i++) {
			arr[i] = i;
		}
		Arrays.parallelPrefix(arr, Long::sum);
		long Tmin = 0;
		long Tmax = 5000;
		long T = 0;
		while(Tmax - Tmin > 1) {
			T = Tmin + (Tmax - Tmin) / 2;
			if(arr[(int) T] > n) {
				Tmax= T;
			} else {
				Tmin = T;
			}
		}
		long x = arr[(int) Tmax] - n;
		LongStream.rangeClosed(1, Tmax).filter(l -> l != x).forEach(System.out::println);
	}
}