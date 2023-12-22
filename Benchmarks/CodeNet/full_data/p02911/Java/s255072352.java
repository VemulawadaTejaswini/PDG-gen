import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		int Q = scan.nextInt();
		
		Integer[] score = new Integer[N];
		
        for(int i = 0; i < N; ++i) {
        	score[i] = K;
        }
		
        for(int j = 0; j < Q; ++j) {
        	
        	int ans = scan.nextInt();
        	
        	for(int i = 0; i < N; ++i) {
        		
        		if(i != (ans - 1)) {
                	score[i] -= 1;
        		}
        		
        	}
        }
		
        for(int i = 0; i < N; ++i) {
        	if(score[i] > 0) {
        		System.out.println("Yes");
        	} else {
        		System.out.println("No");
        	}
        }
		
		scan.close();
	}

}