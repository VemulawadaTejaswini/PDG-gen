import java.util.Scanner;
import java.math.BigDecimal;
import java.util.*;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        long W = sc.nextLong();
        long H = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        double size = (double)(W * H) / 2.0;
        if(W % 2 == 0 && H % 2 == 0){
            if(x == W / 2 && y == H / 2){
                System.out.println(size + " " + 1);
            }else{
                System.out.println(size + " " + 0);
            }
        }else{
            System.out.println(size + " " + 0);
        }
    }
}