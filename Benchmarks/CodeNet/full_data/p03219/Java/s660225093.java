import java.util.*;

public class Main{
    public static void main(String[] args) {
        double num = 0.006;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int T = sc.nextInt();
        int A = sc.nextInt();
        sc.nextLine();
        int num2 = Integer.MAX_VALUE;
        int tmp;
        int ans = 0;
        for(int i = 0; i < N; i++){
            tmp = sc.nextInt();
            if(A - (int)(T - tmp * num) < num2 && A - (int)(T - tmp * num) >= 0){
                num2 = A - (int)(T - tmp * num);
                ans = i+1;
            }
        }
        System.out.println(ans);
    }
}