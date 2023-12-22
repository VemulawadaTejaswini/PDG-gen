import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] sortedArr = new int[N];
		for(int i =0; i< N; i++) {
			arr[i] = sc.nextInt();
			sortedArr[i] = arr[i];
		}
		Arrays.sort(sortedArr);
		int first = sortedArr[N-1];
		int second = sortedArr[N-2];
		StringBuilder sb = new StringBuilder();
		for(int i =0; i< N; i++) {
			if(arr[i] == first) {
				sb.append(second);
			}else {
				sb.append(first);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}
