import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N, M;
	N = sc.nextInt();
	M = sc.nextInt();
	int p[] = new int[M];
	String S[] = new String[M];
	boolean bl[] = new boolean[N];
	for (int i = 0; i < M; i++) {
	    p[i] = sc.nextInt();
	    S[i] = sc.next();
	}
	for (int i = 0; i < N; i++)
	    bl[i] = false;

	int ac = 0;
	int wa = 0;

	if (M < 1) {
	    System.out.println(0 + " " + 0);
	} else {
	    if (S[0].equals("WA")) {
		wa++;
	    } else {
		bl[p[0] - 1] = true;
		ac++;
	    }
	
	    for (int i = 1; i < M; i++) {
		if (S[i].equals("WA") && !bl[p[i] - 1]) {
		    wa++;
		} else if (!bl[p[i] - 1]) {
		    bl[p[i] - 1] = true;
		    ac++;
		}
	    }
  
	System.out.println(ac + " " + wa);
	}

    }
}