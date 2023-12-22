import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if(x == y) {
            System.out.println("-1");
            return;
        }
        if(2*x == y){
            System.out.println(x*3);
        }else{
            System.out.println(x*2);
        }
    }
}