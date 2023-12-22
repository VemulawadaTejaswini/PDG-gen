import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            int tmp = 0;
            for(int j = 0; j < m; j++){
                int a = sc.nextInt();
                tmp += b[j]*a;
            }
            if(tmp + c > 0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
