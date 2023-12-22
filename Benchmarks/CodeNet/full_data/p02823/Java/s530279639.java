import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        long n = scan.nextLong();
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = b - a;
        long out = 0;
        if(c % 2 == 0){
            out = (long) c / 2;
        }else if((a == 1 || b == n) && c <= 2){
            out = 1;
        }else if(c == 1){
            out = 2;
        }else{
            out = (c + 3) / 2;
        }
        System.out.println(out);
    }
}