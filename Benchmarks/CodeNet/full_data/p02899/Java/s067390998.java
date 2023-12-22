import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] order = new int[N+1];
        for (int i = 1; i <= N; i++) {
        	order[sc.nextInt()] = i;
        }
        String ans = "";
        for (int i = 1; i <= N; i++) {
        	if (i == N) {
        		ans += order[i];
        	} else {
        		ans += order[i] + " ";
        	}
        }
        System.out.println(ans);
    }
}