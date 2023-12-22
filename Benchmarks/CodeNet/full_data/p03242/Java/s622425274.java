import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 100;
        int b = (n-a*100) / 10;
        int c = n % 10;
        int ans = 0;
        if(a == 1){
            ans += 900;
        }else{
            ans += 100;
        }
        if(b == 1){
            ans += 90;
        }else{
            ans += 10;
        }
        if(c == 1){
            ans += 9;
        }else{
            ans += 1;
        }
        System.out.println(ans);
    }    
}
