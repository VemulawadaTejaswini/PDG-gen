import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    String ans = "War";
    int[] x = new int[n];
    int[] y = new int[m];
    for (int i = 0; i < n; i++) {
        x[i] = sc.nextInt();  
    }
    for (int i = 0; i < m; i++) {
        y[i] = sc.nextInt();
    }
    loop: for (int i = X; i < Y; i++) {
        for (int j = 0; j < n; j++) {
            if (x[j] > i) {
                continue loop;
            }
        }
        for (int j = 0; j < m; j++) {
            if (y[j] <= i) {
                continue loop;
            }
        }
        ans = "No War";
        break;
    }
    System.out.println(ans);
	}
}
