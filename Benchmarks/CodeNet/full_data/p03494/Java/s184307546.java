import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long min = 1000000000L;
        for(int i = 0; i < N; i++){
            long A = sc.nextLong();
            int cnt = 0;
            while(A % 2 == 0){
                cnt++;
                A /= 2;
            }
            if(min > cnt){
                min = cnt;
            }
        }
        System.out.println(min);
    }
}
