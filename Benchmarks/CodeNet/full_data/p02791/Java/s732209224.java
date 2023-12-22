import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int[] p = new int[N];
        
        for(int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
            for(int j = 0; j <= i; j++) {
                if(p[i] > p[j]) {
                    break;
                }
                if(i == j) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
        
    }
}