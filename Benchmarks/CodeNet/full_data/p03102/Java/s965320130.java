import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int M = Integer.parseInt(sc.next());
	int C = Integer.parseInt(sc.next());
	int[] b = new int[M];
	for(int i = 0; i<M; i++) {
	    b[i] = Integer.parseInt(sc.next());
	}
	int cnt = 0;
	for(int i = 0; i<N; i++) {
	    int tmp = 0;
	    for(int j = 0; j<M; j++) {
		tmp += sc.nextInt() * b[j];
	    }
	    tmp += C;
	    if(tmp>0) cnt++;
	}
	System.out.println(cnt);
    }
}