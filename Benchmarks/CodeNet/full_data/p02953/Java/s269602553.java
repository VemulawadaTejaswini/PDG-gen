import java.util.*;
import java.util.stream.Collectors;


public class Main {

    private static final int INF = 1000000007;
    private static final int INF1 = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int tmp= 0; tmp < n ; tmp++){
            h[tmp] = sc.nextInt();
        }
        int x1 = 0;
        int x2 = 0;
        boolean flag = false;
        for(int tmp=0; tmp<n; tmp++){
            int y = h[tmp];
            if(x1 <= y){
                x2 = x1;
                x1 = y;
                continue;
            }else{
                if(x1 - 1 <= y && x2 - 1 <= y){
                    x2 = x1;
                    x1 = y;
                    continue;
                }else{
                    flag = true;
                    break;
                }
            }
        }

        if(flag){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }
}
