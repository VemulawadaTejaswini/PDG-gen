import java.util.Scanner;

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

      	for (int i = 0; i < N - K + 1; i++) {
        	int min = X[i];
          	int max = X[i + K - 1];
          	int gap;
          	if (min < 0 && max > 0) {
            	gap = max - (min * 2);
            } else if (max <= 0) {
            	gap = - min;
            } else {
              	gap = max;
            }
          	if (gap < smallGap) {
              	smallGap = gap;
            }
        }
      
      System.out.print(smallGap);

    }
}