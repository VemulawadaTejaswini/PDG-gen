import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    void solve() {
		int n = in.nextInt(), k = in.nextInt();
		int ans = 1;
		for(int i = 0; i < n; i++){
			if(ans > k){
				ans += k;
			}else{
				ans *= 2;
			}
		}
		System.out.println(ans);
	}
	
    public static void main(String[] args) {
		new Main().solve();
    }
}
