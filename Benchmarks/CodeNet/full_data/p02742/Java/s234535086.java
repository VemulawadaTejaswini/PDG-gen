import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        long h = scan.nextLong();
        long w = scan.nextLong();
        long a = h * w;
        if(a % 2 == 0){
            System.out.println(a / 2);
        }else{
            System.out.println((long)(a / 2) + 1);
        }
    }
}