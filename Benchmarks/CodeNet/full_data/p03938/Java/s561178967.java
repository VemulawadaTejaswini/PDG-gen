import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrA = new int[n + 1];
		int[] arrB = new int[n + 1];
		for (int i = 1; i <= n; i++) {
		    int x = sc.nextInt();
		    arrA[x] = i;
		    arrB[x] = i;
		}
		for (int i = 1; i < n; i++) {
		    arrA[i + 1] += arrA[i];
		    arrB[n - i] += arrB[n - i + 1];
		}
		StringBuilder sbA = new StringBuilder();
		StringBuilder sbB = new StringBuilder();
		for (int i = 1; i <= n; i++) {
		    if (i != 1) {
		        sbA.append(" ");
		        sbB.append(" ");
		    }
		    sbA.append(arrA[i]);
		    sbB.append(arrB[i]);
		}
		System.out.println(sbA);
		System.out.println(sbB);
   }
}


