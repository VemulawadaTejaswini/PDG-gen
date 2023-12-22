import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        long n = scan.nextLong();
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = b - a;
        if(c % 2 == 0){
            System.out.println((long) (c / 2));
        }else if((a == 1 || b == n) && (c == 1 || c == 2)){
            System.out.println("1");
        }else if(c == 1){
            System.out.println("2");
        }else{
            System.out.println((long) (c / 2) + 1);
        }
    }
}