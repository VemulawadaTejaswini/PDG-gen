import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		final int Q = sc.nextInt();
    		int[] tree = new int[N];
    		int[] values = new int[N];
    		int[] sumValues = new int[N];
    		boolean[] calclated = new boolean[N];

    		for (int i=0; i<N-1; i++) {
    			final int ai = sc.nextInt();
    			final int bi = sc.nextInt();
    			tree[bi-1] = ai-1;
    		}

    		for (int i=0; i<Q; i++) {
    			final int pi = sc.nextInt();
    			final int xi = sc.nextInt();
    			values[pi-1] += xi;
    		}

    		sumValues[0] = values[0];
    		calclated[0] = true;
    		for (int i=1; i<N; i++) {
    			calcSum(tree, values, sumValues, i, calclated);
    		}
    		for (int i=0; i<N; i++) {
    			System.out.print(sumValues[i]);
    			System.out.print(" ");
    		}
    		System.out.println();

    	} finally {
    		sc.close();
    	}
    }

    public static int calcSum(int[] tree, int[] values, int[] sumValues, int currentIndex, boolean[] calculated) {
    	if (!calculated[currentIndex]) {
        	sumValues[currentIndex] = values[currentIndex] + calcSum(tree, values, sumValues, tree[currentIndex], calculated);
        	calculated[currentIndex] = true;
    	}
    	return sumValues[currentIndex];
    }
}

