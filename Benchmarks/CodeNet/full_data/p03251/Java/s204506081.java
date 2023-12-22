import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    String ans = "";
    if (X > Y) {
        ans = "War";
    }
    for (int i = 0; i < n; i++) {
        int x = sc.nextInt();  
        if (x < Y) {
            continue;            
        }
        ans = "War";
    }
    for (int i = 0; i < m; i++) {
        int y = sc.nextInt();
        if (y > X) {
            continue;
        }
        ans = "War";
    }
    if (ans.isEmpty()) {
        ans = "No War";
    }
    System.out.println(ans);
	}
}
