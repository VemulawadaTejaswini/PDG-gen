import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int[] map = new int[100001];
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < n; i++){
            map[sc.nextInt()] += sc.nextInt();
        }
        for(int i = 1; i <= n; i++){
            k -= map[i];
            if(k <= 0){
                System.out.println(i);
                return;
            }
        }
    }
}
