import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] inputs = line.split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);
        int Q = Integer.parseInt(inputs[2]);

//        System.out.println(N);
//        System.out.println(K);
//        System.out.println(Q);
        int[] scores = new int[N];
        for (int i = 0; i < Q; i++) {
        	String ans = sc.nextLine();
//        	System.out.println(ans);
        	int id = Integer.parseInt(ans) -1;
        	scores[id]++;
        }
        for (int i = 0; i < scores.length; i++) {
//        	System.out.println(scores[i]);
        	if (Q - scores[i] < K) {
        		System.out.println("Yes");
        	} else {
        		System.out.println("No");
        	}
        }
	}





}