import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		    java.util.Scanner scanner = new java.util.Scanner(System.in);
                    int n = scanner.nextInt();
                    int[] a = new int[n];
                    int[] b = new int[n];
                    int[] c = new int[n];
                    for (int i = 0; i < n; i++) {
                         a[i] = scanner.nextInt();
                    }
                    for (int i = 0; i < n; i++) {
                         b[i] = scanner.nextInt();
                    }
                    for (int i = 0; i < n; i++) {
                         c[i] = scanner.nextInt();
                    }
                    Arrays.sort(a);
                    Arrays.sort(b);
                    Arrays.sort(c);
                    int total = 0;
                    for (int i = 0; i < n; i++) {
                      int aindex = Arrays.binarySearch(a, b[i]) - 1;
                      int cindex = Arrays.binarySearch(c, b[i]);
                      total = total + ( aindex  * cindex);
                    }
                    System.out.println(total);
		 } 
}