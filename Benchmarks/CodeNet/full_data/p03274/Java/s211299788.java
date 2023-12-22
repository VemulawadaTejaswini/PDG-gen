import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	int N = input.nextInt();
      	int K = input.nextInt();
      	int[] X = new int[N];
      	int smallGap = 1000000000;
      
      	for (int i = 0; i < N; i++) {
        	X[i] = input.nextInt();
        }

      	for (int i = 0; i <= N - K; i++) {
          	int[] tmp = new int[K + 1];
			for (int j = 0; j < K; j++) {
              tmp[j] = X[i + j];
            }
          	tmp[K] = 0;
          	Arrays.sort(tmp);
          	int gap = Math.abs(tmp[K] - tmp[0]);
          	if (gap < smallGap) {
              	smallGap = gap;
            }
        }
      
      System.out.print(smallGap);

    }
}