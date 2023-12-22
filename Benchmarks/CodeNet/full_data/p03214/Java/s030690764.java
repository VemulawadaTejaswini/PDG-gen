import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        double total = 0;
        double ave = 0;
        double distance = 0;
        double ans = 1000000;
        int x = 0;
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            total += a[i];
        }
        ave = total / N;
        for(int i = 0; i < N; i++){
            distance = Math.abs(ave - a[i]);
            if(ans > distance){
                ans = distance;
                x = i;
            }
        }
        System.out.println(x);
    }
}
