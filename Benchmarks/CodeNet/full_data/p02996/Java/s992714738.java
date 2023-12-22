import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		PriorityQueue pq = new PriorityQueue(N, new MyComparator());
		for(int i = 1;i <= N;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			Sigoto s = new Sigoto(A, B);
			pq.add(s);
		}
		sc.close();

		long time = 0;
		boolean success = true;
		for(int i = 1;i <= N;i++) {
			Sigoto s = (Sigoto) pq.poll();
//			System.out.println(s);
			time += s.A;
			if(time > s.B) {
				success = false;
				break;
			}

//			System.out.println(time);
		}
		if(success) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}



	}
}

class MyComparator implements Comparator<Sigoto> {
	@Override
	public int compare(Sigoto s1, Sigoto s2) {
		if(s1.B < s2.B) {
			return -1;
		}else if(s1.B > s2.B) {
			return 1;
		}else {
			return 0;
		}
	}
}

class Sigoto {
	public long A;
	public long B;
//	public long C;

	public Sigoto(long a, long b) {
		A = a;
		B = b;
//		C = b - a;
	}

	@Override
	public String toString() {
		return "Sigoto [A=" + A + ", B=" + B + "]";
	}


}