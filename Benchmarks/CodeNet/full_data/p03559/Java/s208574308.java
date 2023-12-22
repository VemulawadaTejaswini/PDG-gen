import java.util.*;

//
//

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int[] A = new int[N];
		TreeSet<Integer> Bset = new TreeSet<Integer>();
		ArrayList<Integer> Barr = new ArrayList<Integer>();
		TreeSet<Integer> Cset = new TreeSet<Integer>();
		ArrayList<Integer> Carr = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		for (int i = 0; i < N; i++) {
			int n = in.nextInt();
			Bset.add(n);
			Barr.add(n);
		}
		for (int i = 0; i < N; i++) {
			int n = in.nextInt();
			Cset.add(n);
			Carr.add(n);
		}
		
		Barr.sort(null);
		Carr.sort(null);
		
		long answer = 0;
		
		for (int i = 0; i < N; i++) {
			int a = A[i];
			Integer b = Bset.higher(a);
			int bindex = Barr.indexOf(b);
			
			for (int j = bindex; j < N && b != null; j++) {
				Integer c = Cset.higher(Barr.get(j));
				
				if (c != null) {
					int cindex = Carr.indexOf(c);
					
//					System.out.printf("a: %d, b: %d, c: %d, bindex: %d, cindex: %d\n", a, b, c, bindex, cindex);
					
					answer += (N - cindex);
				} else {
					break;
				}
			}
		}
		System.out.println(answer);
	}
}