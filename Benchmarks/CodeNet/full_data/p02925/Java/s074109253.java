import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		Queue<Integer>[] queue = new Queue[N];
    		for (int i=0; i<N; i++) {
    			queue[i] = new ArrayDeque<Integer>();
    			for (int j=0; j<N-1; j++) {
    				queue[i].add(sc.nextInt());
    			}
    		}

    		int day = 0;
    		while (true) {
    			int[] cards = new int[N+1];
        		for (int i=1; i<N; i++) {
        			Integer card = queue[i-1].peek();
        			if (card != null) {
            			if (cards[i] == 0 && cards[card] == 0) {
            				if (queue[card-1].peek() != i) {
                				System.out.println(-1);
                				System.exit(0);
            				}
            				cards[i] = card;
            				cards[card] = i;
            				queue[i-1].remove();
            				queue[card-1].remove();
            			} else if (cards[i] == card && cards[card] == i) {
            				queue[i-1].remove();
            			} else if ((cards[i] == card && cards[card] != i) || (cards[i] != card && cards[card] == i)) {
            				System.out.println(-1);
            				System.exit(0);
            			}
        			}
        		}

        		boolean finished = true;
        		for (int i=0; i<N; i++) {
        			if (!queue[i].isEmpty()) {
        				finished = false;
        				break;
        			}
        		}
        		day++;
        		if (finished) {
        			break;
        		}
    		}

    		System.out.println(day);

    	} finally {
    		sc.close();
    	}
    }
}

