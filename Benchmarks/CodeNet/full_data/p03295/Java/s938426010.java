import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int[] c1 = new int[M];
	int[] c2 = new int[M];
	for(int i = 0; i< M; i++) {
	    c1[i] = sc.nextInt();
	    c2[i] = sc.nextInt();
	}
	Arrays.sort(c1);
	Arrays.sort(c2);
	int maxi = c1.length-1;
	int max = c1[maxi];
	int premax = 0;
	int min = c2[0];
	int cnt = 1;
	while(max >= min) {
	    if(premax != max) {
		cnt++;
	    }
	    maxi--;
	    if(maxi<0) break;
	    premax = max;
	    max = c1[maxi];
	}
	System.out.println(cnt);


    }
}