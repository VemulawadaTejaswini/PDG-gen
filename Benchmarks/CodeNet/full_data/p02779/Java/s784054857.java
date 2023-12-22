import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
     	java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
		for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
              if (a[i] == a[j]){
                System.out.println("NO");
                System.exit(0);
              }
            }
        }
      System.out.println("YES");
	}

}
