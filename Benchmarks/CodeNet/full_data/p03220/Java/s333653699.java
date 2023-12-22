import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int T = sc.nextInt();
	int A = sc.nextInt();
	int[] offset = new int[N];
	int min = Integer.MAX_VALUE;
	int minIndex = 0;
	for(int i = 0; i<N; i++) {
	    offset[i] = (int)(Math.abs((T - 0.006*sc.nextInt()) - A));
	    if(min> offset[i]) {
		min = offset[i];
		minIndex = i;
	    }
	}
	System.out.println(minIndex+1);
    }
}