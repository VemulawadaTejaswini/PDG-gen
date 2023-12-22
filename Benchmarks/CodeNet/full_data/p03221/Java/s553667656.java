import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int[] P = new int[M];
	int[] Y = new int[M];
	int[] sortY = new int[M];
	int[] countN = new int[N+1];
	int[] Ynum = new int[M];


	for(int i = 0; i<M; i++) {
	    P[i] = sc.nextInt();
	    Y[i] = sc.nextInt();
	    sortY[i] = Y[i];
	}
	Arrays.sort(sortY);
	for(int i = 0; i<M; i++) {
	    int index = 0;
	    for(int j = 0; j<M; j++) {
		if(Y[i] == sortY[j]) {
		    countN[P[i]]++;
		    Ynum[i] = countN[P[i]];
		    break;
		}
	    }
	}

	for(int i = 0; i<M; i++) {
	    String ans = String.format("%06d", P[i]) + String.format("%06d", Ynum[i]);
	    System.out.println(ans);
	}

    }
}