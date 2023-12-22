import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long H, W;
        H = sc.nextLong();
        W = sc.nextLong();
        long odd = (long)Math.ceil((double)W/2);
        long even = (long)Math.floor((double)W/2);

        long res = (H/2) * even + (long)Math.ceil((double)H/2) * odd;
        System.out.println(res);
    }

}
