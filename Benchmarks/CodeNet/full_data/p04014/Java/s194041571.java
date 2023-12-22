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
            long n = sc.nextLong();
            long s = sc.nextLong();
//            for(int i = 2;i<87654;i++){
//                System.out.print(i+ " ");
//                System.out.println(fbn(i,87654));
//                Thread.sleep(500);
//            }
            for(long i = 2;i<n;i++){
                if(fbn(i,n) == s){
                    System.out.println(i);
                    System.exit(0);
                }
            }
            
            System.out.println(-1);
    }
}