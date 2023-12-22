import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
	new Main().doIt();
    }
    void doIt() { A(); }
    void A() {
        int A = sc.nextInt(), B = sc.nextInt();
	int ans = A+B;
	ans = Math.max(ans, Math.max(A-B, A*B));
	System.out.println(ans);
    }
}
