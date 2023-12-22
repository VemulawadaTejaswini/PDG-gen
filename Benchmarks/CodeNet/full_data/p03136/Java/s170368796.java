import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] l = new int[N];
	int max = 0;
	int maxI = 0;
	for(int i = 0; i<N; i++) {
	    l[i] = sc.nextInt();
	    if(max < l[i]) {
		max = l[i];
		maxI = i;
	    }
	}
	int others = 0;
	for(int i = 0; i<N; i++) {
	    if(i == maxI) continue;
	    others += l[i];
	}
	if(others > max) {
	    System.out.println("Yes");
	}else {
	    System.out.println("No");
	}
    }
}