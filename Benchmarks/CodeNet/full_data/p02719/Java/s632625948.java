import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = 0;
        long sub = 0;
        if(n % k == 0){
            System.out.println(0);
        }
        ans = n % k;
//        System.out.println(ans);
        sub = k - ans;
//        System.out.println(sub);
        if(ans < sub){
            System.out.println(ans);
        }else{
            System.out.println(sub);
        }        
        sc.close();
    }
}