import java.util.*;
class Node {
    int index;
    int count;
    public Node(int index, int count) {
	this.index = index;
	this.count = count;
    }
}
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int[] a = new int[N-1];
	int[] b = new int[N-1];
	int[] c = new int[N+1];
	int[] cnt = new int[N+1];
	Node[] node = new Node[N+1];
	int[] weight = new int[N+1];
	for(int i = 0; i<N-1; i++) {
	    a[i] = sc.nextInt();
	    b[i] = sc.nextInt();
	    cnt[a[i]]++;
	    cnt[b[i]]++;
	}

	for(int i = 0; i<=N; i++) {
	    node[i] = new Node(i, cnt[i]);
	}
	Arrays.sort(node,(ca,cb)->(cb.count-ca.count));


	for(int i = 1; i<=N; i++) {
            c[i] = sc.nextInt();
        }
	Arrays.sort(c);

	for(int i = 0; i<N; i++) {
	    weight[node[i].index] = c[N-i]; 
	    //	    System.out.println("node "+node[i].index+" weight "+weight[node[i].index]);
	}
	long ans = 0;
	for(int i = 0; i<N-1; i++){
	    int min = Integer.MAX_VALUE;
	    ans += Math.min(weight[a[i]], weight[b[i]]);
	}

	System.out.println(ans);
	for(int i = 1; i<=N; i++) {
	    System.out.print( weight[i] + " " );
	}
	System.out.println();

    }
}