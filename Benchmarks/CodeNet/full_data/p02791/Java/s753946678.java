import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 999999999;
        long sum = 0;
        for(int i=0;i<N;i++){
            int now = sc.nextInt();
            if(now<max){
                max = now;
                sum++;
            }
        }
        System.out.println(sum);
    }
}