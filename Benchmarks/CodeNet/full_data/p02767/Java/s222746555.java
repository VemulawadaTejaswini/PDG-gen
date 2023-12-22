import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i =0;  i < n; i++ ) {
            x[i] = sc.nextInt();
        }
        int sum = 0;
        int min = 0;
        for (int p =1; p<= 100; p++){
            for (int i = 0; i< n; i++){
                sum = (int) (sum + Math.pow(x[i] - p, 2));
            }
            if (p == 1){
                min = sum;
            } else if (sum < min) {
                min = sum;
            }
            sum = 0;
        }
        System.out.println(min);
    }
}
