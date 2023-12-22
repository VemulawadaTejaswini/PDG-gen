import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
	new Main().doIt();
    }
    void doIt() { D(); } 
    void D() {
	long ans = 0;
	int N = sc.nextInt(), M = sc.nextInt();
	HashMap<Integer, ArrayList<Integer> > hash =  new HashMap<Integer, ArrayList<Integer> > ();
	for(int i = 0; i < N; i++) {
	    int A = sc.nextInt(), B = sc.nextInt();
	    if(! hash.containsKey(A)) {
		hash.put(A, new ArrayList<Integer>());
	    }
	    hash.get(A).add(B);
	}
	PriorityQueue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer>() {
		public int compare(Integer i0, Integer i1) {
		    return i1 - i0;
		}
	    } );
	for(int d = 1; d <= M; d++) {
	    if(hash.containsKey(d)) {
		for(Integer data : hash.get(d)) q.add(data);
	    }
	    //	    System.out.println(d + " " + q.size() + " " + hash.get(d) + ans );
	    if(! q.isEmpty()) {
		long tmp = q.poll();
		ans += tmp;
		//		System.out.println("Answer=" + ans + " " + tmp + " " + q.size());
	    }
	}
	System.out.println(ans);
    }
    void C() {
	long ans = 0;
	ArrayList<String> s = new ArrayList<String>();
	int N = sc.nextInt();
	for(int i = 0; i < N; i++) {
	    char [] work = sc.next().toCharArray();
	    Arrays.sort(work);
	    s.add(new String(work));
	}
	Collections.sort(s);
	//	for(String ss: s) System.out.println(ss);
	int cnt = 0;
	for(int i = 1; i < N; i++) {

	    if(s.get(i-1).equals(s.get(i))) {
		cnt++;
		ans += cnt;
	    } else cnt = 0;
	}
	System.out.println(ans);


    }
    void B() {
	int K = sc.nextInt(), X = sc.nextInt();
	ArrayList<Integer> ans = new ArrayList<Integer>();
	for(int i = X-(K-1); i <= X+(K-1); i++) ans.add(i);
	//	System.out.println(ans);
	for(Integer i: ans) System.out.print(" " + i);
	System.out.println();
    }
    void A() {
	int A = sc.nextInt(), B = sc.nextInt();
	int ans = A+B;
	ans = Math.max(ans, Math.max(A-B, A*B));
	System.out.println(ans);
    }
}


