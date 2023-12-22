import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        final int n = sc.nextInt();
        final int[] X = new int[n];
        
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(X);
        int sum = 0, min = -1;
        for (int i = X[0]; i < X[n-1]; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(i - X[j],2);
            }
            if(min == -1 ||sum < min)
                min = sum;
        }
        System.out.println(min);
    }
}