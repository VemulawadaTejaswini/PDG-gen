import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int penalty = 0, correct = 0;
		
		for(int i=0; i<M; i++) {
			int p = sc.nextInt();
			String res = sc.next();
			if(res.equals("AC")) {
				correct++;
			} else {
				if(i != M-1) penalty++;
			}
		}
		
		System.out.println(correct + " " + penalty);
			
	}

}
