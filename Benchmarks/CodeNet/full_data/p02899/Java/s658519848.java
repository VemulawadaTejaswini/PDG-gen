import java.util.*;

class Main {

    public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int A[] = new int[N];
	Map<Integer, Integer> mMap = new HashMap<Integer, Integer>();
	for (int i = 0;i < N; i++) {
	    A[i] = sc.nextInt();
	    mMap.put(A[i], i + 1);
	}

	Object[] mapkey = mMap.keySet().toArray();
        Arrays.sort(mapkey);

	for (Integer nKey : mMap.keySet()) {
	    System.out.print(mMap.get(nKey) + " ");
	}
	System.out.println();
    }
}