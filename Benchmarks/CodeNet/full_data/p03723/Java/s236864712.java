import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a == b && b == c){
            System.out.println(-1);
            return;
        }
        int out = 0;
        while(a % 2 == 0 && b % 2 == 0 && c % 2 == 0){
            int aa = b / 2 + c / 2;
            int ba = a / 2 + c / 2;
            int ca = a / 2 + b / 2;
            a = aa; b = ba; c = ca;
            out++;
        }
        System.out.println(out);
        scan.close();
    }
}