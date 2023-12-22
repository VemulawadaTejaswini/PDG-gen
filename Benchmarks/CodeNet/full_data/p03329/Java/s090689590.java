import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Receive number
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt(); // Input

    	// Declare
    	int cnt = 0;
    	int[] list = {59049, 46656, 7776, 6561, 1296, 729, 216, 81, 26, 9, 6, 1};

    	// Calculate
    	for (int i=0; i < 11; i++) {
    		cnt += N / list[i];
    		N %= (N / list[i]);
    		if (N == 0) {
    			break;
    		}
    	}

    	System.out.print(cnt);
	}
}
