import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int[] P = new int[M];
	int[] countN = new int[N+1];
	int[] Ynum = new int[M];
	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	HashMap<Integer, List<Integer>> mapYP = new HashMap<Integer,List<Integer>>();
	HashMap<Integer, List<Integer>> mapYI =new HashMap<Integer,List<Integer>>();

	for(int i = 0; i<M; i++) {
	    P[i] = sc.nextInt();
	    int Y = sc.nextInt();
	    List<Integer> listP = (mapYP.get(Y) == null)?new LinkedList<Integer>(): mapYP.get(Y);
	    listP.add(P[i]);
	    mapYP.put(Y,listP);
	    List<Integer> listI = (mapYI.get(Y) == null)?new LinkedList<Integer>():mapYI.get(Y);
	    listI.add(i);
	    mapYI.put(Y,listI);
	    queue.add(Y);
	}
	for(int i = 0; i<M; i++) {
	    int min = queue.poll();
	    int indexP = mapYP.get(min).remove(0);
	    countN[indexP]++;
	    int indexI = mapYI.get(min).remove(0);
	    Ynum[indexI] = countN[indexP];
	}

	for(int i = 0; i<M; i++) {
	    String ans = String.format("%06d", P[i]) + String.format("%06d", Ynum[i]);
	    System.out.println(ans);
	}

    }
}