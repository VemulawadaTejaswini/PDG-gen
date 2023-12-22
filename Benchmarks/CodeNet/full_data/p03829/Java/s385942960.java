import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		int[] town = new int[n];

		for(int i=0;i<n;i++)town[i] = Integer.parseInt(sc.next());
		sc.close();
		long cnt = 0;
		for(int i=0;i<n-1;i++) {
			cnt+=Math.min((town[i+1]-town[i])*a, b);
		}
		System.out.println(cnt);
	}

}
