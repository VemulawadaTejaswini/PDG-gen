import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int total = 0;
        double distance[] = new double[N];
        double answer = 1000000;
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            total += a[i];
        }
        double ave = (double)(total / N);
        for(int i = 0; i < N; i++){
            distance[i] = Math.abs(ave - a[i]);
            if(answer>distance[i]){
                answer = distance[i];
            }
        }
        System.out.println(answer);
    }
}
