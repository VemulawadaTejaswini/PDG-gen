import java.util.*;
import java.lang.Math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] p = new int[n];
      
        for (int i=0; i < n; i++) {
            p[i] = sc.nextInt();
        }
      
        int cnt = 1;
      
        for (int i = 1; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (p[j] < p[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cnt++;
            };
        }
        
        System.out.println(cnt);
        
	}
}