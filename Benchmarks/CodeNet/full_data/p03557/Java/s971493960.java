import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		Arrays.setAll(a, i -> sc.nextInt());
		Arrays.setAll(b, i -> sc.nextInt());
		Arrays.setAll(c, i -> sc.nextInt());
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
//		System.out.print("a:[");
//		Arrays.stream(a).forEach(s -> System.out.print(s + ", "));
//		System.out.println("]");
//		System.out.print("b:[");
//		Arrays.stream(b).forEach(s -> System.out.print(s + ", "));
//		System.out.println("]");
//		System.out.print("c:[");
//		Arrays.stream(c).forEach(s -> System.out.print(s + ", "));
//		System.out.println("]");
		long ans = 0;
		for (int i = 0; i < n; i++) {
//			System.out.println("i:" + i);
			int idxA = Arrays.binarySearch(a, b[i]);
			if (idxA < 0) idxA = ~idxA;
//			System.out.println("idxA:" + idxA);
			int numA = idxA;
//			System.out.println("numA:" + numA);
			
			int idxC = Arrays.binarySearch(c, b[i]);
			if (idxC < 0) idxC = ~idxC;
			if (idxC == n) continue;
			if (c[idxC] == b[i]) idxC++;
//			System.out.println("idxC:" + idxC);
			int numC = n - idxC;
//			System.out.println("numC:" + numC);
			
			ans += numA * numC;
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
