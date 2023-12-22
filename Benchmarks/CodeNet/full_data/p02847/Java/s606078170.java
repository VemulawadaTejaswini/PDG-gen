import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        long a = console.nextLong();
        long b = console.nextLong();
        long x = console.nextLong();
        console.nextLine();

        // 1つも購入できないときの処理
        if(x < getPrice(a, b, 1)){
            System.out.println(0);
            return;
        }

        // 1つ以上購入する場合
        long minN = 1;
        long maxN = x;
        long midN = (minN + maxN) / 2;
        long answer = 1;

        while(maxN - minN > 1) {
            long moneyNeededMid = getPrice(a, b, midN);

            if(x == moneyNeededMid){
                minN = midN;
                maxN = midN;
                midN = (minN + maxN) / 2;
            }else if(x > moneyNeededMid){
                minN = midN;
                midN = (minN + maxN) / 2;
            }else if(x < moneyNeededMid){
                maxN = midN;
                midN = (minN + maxN) / 2;
            }
            answer = minN;
        }
        if(answer >= 1000000000){
            answer = 1000000000;
        }
        System.out.println(0);
    }

    public static long getPrice(long a, long b, long n){
        return (a * n) + (b * String.valueOf(n).length());
    }
}
