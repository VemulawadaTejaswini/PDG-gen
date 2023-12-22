
import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String msg = "NO";
        if(a + b == c || b + c == a || c + a == b){
            msg = "YES";
        }
        System.out.println(msg);
    }
}