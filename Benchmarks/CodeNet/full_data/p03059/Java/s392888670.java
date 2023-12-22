import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        double t =sc.nextDouble();
        double nowTime = a;
        while(nowTime < t + 0.5){
            ans += b;
            nowTime += a;
        }
        System.out.println(ans);
    }

}
