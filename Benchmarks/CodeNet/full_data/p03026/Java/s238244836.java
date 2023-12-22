import java.util.*;
class Main {
    static int N;
    static int[] a,b,c;
    static int[] w;
    static int score;
    static int[] dict;
    static int index;
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		a = new int[N-1];
		b = new int[N-1];
		c = new int[N];
		for(int i = 0; i<N-1; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 0; i<N; i++) {
			c[i] = sc.nextInt();
		}

		Arrays.sort(c);

		dict = new int[N+1];
		w = new int[N+1];
		for(int i = 0; i<N+1; i++) {
			dict[i] = 1;
		}

//		dict[1] = -1;
//		w[1] = c[N-1];
		score = 0;
		index = N-1;
		dfs(1);

		for(int i = 0; i<N-1; i++) {
			score += Math.min(w[a[i]],w[b[i]]);
		}
		System.out.println(score);
		for(int i = 1; i<N+1; i++) {
			System.out.print(w[i] + " ");
		}
		System.out.println();
    }


	public static void dfs(int next) {
		if(next == -1) return;
		if(index <= -1) return;
		w[next] = c[index];
		System.out.println(w[next]);
		index--;
		int nextnext = getNext(next);
		//System.out.println("i " + index + " next " + next + " nextnext " + nextnext);
		while(nextnext != -1) {
			dfs(nextnext);
			nextnext = getNext(next);
		}
	}

    public static int getNext(int pre) {
		for(int i = 0; i<N-1; i++) {
			if(a[i] == pre && dict[b[i]] != -1)  {
				dict[a[i]] = -1;
				dict[b[i]] = -1;
				return b[i];
			}
			if(b[i] == pre && dict[a[i]] != -1)  {
				dict[a[i]] = -1;
				dict[b[i]] = -1;
						return a[i];
					}
		}
		return -1;
    }
}