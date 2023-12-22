import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        int r = scan.nextInt();
        int a = p + q;
        int b = q + r;
        int c = r + p;
        int out = a;
        if(a > b){
            out = b;
            if(b > c){
                out = c;
            }
        }
        if(a > c){
            out = c;
            if(c > b){
                out = b;
            }
        }
        System.out.println(out);
    }
}