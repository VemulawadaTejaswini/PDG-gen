import java.util.Scanner;
 
public class Main {
 
    static Scanner in = new Scanner(System.in);
 
    void solve() {
		int r = in.nextInt(), g = in.nextInt();
		System.out.println(r +(g-r)*2);
	}
	
    public static void main(String[] args) {
		new Main().solve();
    }
}