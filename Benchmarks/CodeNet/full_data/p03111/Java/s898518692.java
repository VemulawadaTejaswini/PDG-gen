import java.util.*;
class Main {
    static int A,B,C;
    static int[] array;
    static int N;
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	N = Integer.parseInt(sc.next());
	A = Integer.parseInt(sc.next());
	B = Integer.parseInt(sc.next());
	C = Integer.parseInt(sc.next());
	array = new int[N];
	for(int i = 0; i<N; i++) {
	    array[i] = Integer.parseInt(sc.next());
	}

	System.out.println(dfs(0,0,0,0,0));
    }

    public static int dfs(int depth, int za, int zb, int zc, int cost) {
	if(depth == N) {
	    if(za>0 && zb>0 && zc>0) return (int)Math.abs(za-A) + (int)Math.abs(zb-B) + (int)Math.abs(zc-C) + cost;
	    else return Integer.MAX_VALUE;
	}
	int notadd = dfs(depth+1, za, zb, zc, cost+0);
	int adda, addb,addc = 0;
	if(za == 0) {
	    adda = dfs(depth+1, za + array[depth], zb, zc, cost+0);
	} else {
	    adda = dfs(depth+1, za + array[depth], zb, zc, cost+10);
	}

	if(zb == 0) {
	    addb = dfs(depth+1, za, zb + array[depth], zc, cost);
	} else {
            addb = dfs(depth+1, za, zb + array[depth], zc, cost+10);
	}

	if(zc == 0) {
            addc = dfs(depth+1, za, zb, zc + array[depth], cost);
	} else {
            addc = dfs(depth+1, za, zb, zc + array[depth], cost+10);
        }

	int min = Math.min(notadd, adda);
	min = Math.min(min, addb);
	min = Math.min(min, addc);
	return min;
    }

}