import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        ans = a+b;
        if(ans<a-b)ans=a-b;
        if(ans<a*b)ans=a*b;
        System.out.println(ans);
    }
}