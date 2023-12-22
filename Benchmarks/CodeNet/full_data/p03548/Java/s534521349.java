import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),ans = 0;
        ans = a / ( b + c);
        ans = ans % 2 == 0 ? ans-1 : ans;
        System.out.println(ans);
    }
}
