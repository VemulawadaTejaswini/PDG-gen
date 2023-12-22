import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a=0;
        int b=0;
        for (int i=0;i<s.length();i=i+2){
            int cur = s.charAt(i)-'0';
            if (cur == 1 ) ++a;
            else ++b;
        }
        for (int i=1;i<s.length();i=i+2){
            int cur = s.charAt(i)-'0';
            if (cur == 0 ) ++a;
            else ++b;
        }
        System.out.println(Math.min(a,b));
    }
}
