import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            // 1行ずつ数字取得
        	int a = sc.nextInt();
			int b = sc.nextInt();
			
			ans = ans + b - a + 1;
        }
        System.out.println(ans);
    }
}
