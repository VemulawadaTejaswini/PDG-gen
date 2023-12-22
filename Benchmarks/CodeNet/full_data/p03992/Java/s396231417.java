import java.util.*;
public class Main {
    
    public static long fbn(long b, long n){
        if(n<b)
            return n;
        else
            return fbn(b,n/b) + n % b;
    }
    
    public static void main(String[] args) throws InterruptedException{
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(s.substring(0,4) + " " +s.substring(4));
    }
}