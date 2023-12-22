import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        int k = sc.nextInt();
        double ans = 0;
        double d = 0.5;
        for(int i = 1; i <= n; i++){
            double j = i;
            int l = 1;
            while(k>j){
                double num1 = Math.pow(2,l);
                j = i * num1;
                l = l + 1;
            }
            l = l -1;
            double num = Math.pow(d,l);
            double num2 = (double)1 / n;
            ans = ans + num2 * num;
        }
        System.out.println(ans);
    }
}