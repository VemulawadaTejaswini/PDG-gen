import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int temp,r=0;
        while(n>=0){
            temp=n%10;
            n/=10;
            r+=n%10==temp?1:0;
        }
        // 出力
        System.out.println(r);
    }
}
