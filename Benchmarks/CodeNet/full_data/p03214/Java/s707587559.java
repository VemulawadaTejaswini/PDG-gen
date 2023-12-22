import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int total = 0;
        double distance[] = new double[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            total += a[i];
        }
        double ave = (double)(total / N);
        for(int i = 0; i < N; i++){
            distance[i] = ave - a[i];
        }
        System.out.println(Math.min(distance[]));
        
    }
}
