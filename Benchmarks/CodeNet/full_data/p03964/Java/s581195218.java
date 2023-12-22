import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int curA = sc.nextInt();
        int curB = sc.nextInt();
        
        int a = 0, b = 0;
        for(int i = 1; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a >= curA && b >= curB) {
                curA = a;
                curB = b;
            } else {
                int rate = Math.max((curA + a - 1) / a, (curB + b - 1) / b);
                curA = a * rate;
                curB = b * rate;
            }
        }
        
        System.out.println(curA + curB);
    }
}
