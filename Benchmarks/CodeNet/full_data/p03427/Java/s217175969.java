import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long keta = Long.toString(n).length();
        long max = n/(long)Math.pow(10,keta-1);
        long ans = 0;

        for(long i = max;i >= 0;i--){
            String number = Long.toString(i);
            for(long j = 0;j < keta-1;j++){
                number += "9";
            }
            if(Long.parseLong(number) <= n){
                ans = i+9*(keta-1);
                break;
            }
        }
        System.out.println(ans);
        
    }
}