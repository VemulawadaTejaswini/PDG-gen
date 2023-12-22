import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        // write your code here
        /*
        System.out.println(ruijou(33));
        System.exit(0);
 
        */
        Scanner scanner = new Scanner(System.in);
        long x=scanner.nextLong();
        long y=scanner.nextLong();
        long z=y/x;
        System.out.println(ruijou(z)+1);
    }
    public static long ruijou(long n){
        if(n<2){
            return 0;
        }else{
            return ruijou(n/2)+1;
        }
    }
}