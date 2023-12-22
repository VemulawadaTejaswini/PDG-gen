import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = 0;
        if(N % 2 == 0){
            int i = 0;
            while(10 * Math.pow(5, i) <= N){
                ans += N / (10 * Math.pow(5, i));
                i++;
            }
            
        }
        else{
            System.out.println("0");
            return;
        }
        System.out.println(ans);
    }
}