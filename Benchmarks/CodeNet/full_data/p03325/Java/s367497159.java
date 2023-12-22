import java.util.Scanner;

public class Main {

	public static int answer = 0;

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

	    int N = scanner.nextInt();
	    long [] a = new long[N];
	    int answersub = 0;
	    for(int i = 0;i < N;i++){
	    	a[i] = scanner.nextInt();
	    }

	    operate(N, a, answersub);

	    System.out.println(answer);

	    scanner.close();
    }

	public static void operate(int N, long[] a, int answersub){
		boolean check = false;
		long [] b = new long[N];
		long maxeven = -2;
		int maxevenpos = -1;


		for(int i = 0;i < N;i++){
	    	if(a[i]%2 == 0) {
	    		if(maxeven < a[i]) {
	    			maxeven = a[i];
	    			maxevenpos = i;
	    		}
	    		check = true;
	    	}
	    }
		if(check){
			answersub++;
			if(answer < answersub) answer = answersub;
			for(int j = 0;j < N; j++){
				if(j != maxevenpos) b[j] = a[j] * 3;
		    	else b[j] = a[j] / 2;
			}
			operate(N, b, answersub);
		}
	}

}
