import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] AmB = new int[N];
		//int[] BmA = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
			AmB[i] = A[i]+B[i];
			//BmA[i] = B[i]-A[i];
		}
		Integer[] AmBindex = argsort(AmB);
		//int num = N%2==0? N/2-1 : N/2;
		long scoreA = 0;
		//int scoreB = 0;
		for(int i=0;i<N;i++) {
			if (i%2==0) scoreA += A[AmBindex[i]];
			else scoreA -= B[AmBindex[i]];
		}
		System.out.println(scoreA);
	}
	
	public static Integer[] argsort(final int[] a) {
        Integer[] indexes = new Integer[a.length];
        for (int i = 0; i < indexes.length; i++) {
            indexes[i] = i;
        }
        Arrays.sort(indexes, new Comparator<Integer>() {
            @Override
            public int compare(final Integer i1, final Integer i2) {
                return -1 * Integer.compare(a[i1], a[i2]);
            }
        });
        return indexes;
    }
}