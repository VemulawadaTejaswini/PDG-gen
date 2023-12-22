import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int keta = getRigidNum(N);
        int result = 0;
        for (int i = 1; i < keta+1; i++) {
        	if (i % 2 == 1 && i < keta) {
        		result += (nijyou(10, i) - 1) - nijyou(10, i-1) + 1;
        	}else if (i % 2 == 1 && i == keta) {
        		result += N - nijyou(10, i-1) + 1;
        	}
        }


        System.out.println(result);
    }

    private static int getRigidNum(int n) {
    	int i = 1;
    	while (n / nijyou(10, i) > 0) {
    		i++;
    	}
    	return i;
    }

    private static int nijyou(int n, int i) {
    	if (i == 0) {
    		return 1;
    	}
    	else if (i == 1) {
    		return n;
    	}else {
        	return n*nijyou(n, i - 1);
    	}

    }



}