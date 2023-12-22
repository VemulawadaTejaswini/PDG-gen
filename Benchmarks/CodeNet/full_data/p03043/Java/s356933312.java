import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double ans =0;

        for(int i = 0;i< N;i++){

            int count =0;
            int point = i+1;
            while(point < K){
                point = 2 * point;
                count++;
            }
            ans += Math.pow(0.5,count);

        }
        System.out.println(ans / N);
    }
}
