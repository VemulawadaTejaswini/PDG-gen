import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long W = sc.nextLong();
        long H = sc.nextLong();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        String split = "0";
        if (W/2 == X && H/2 == Y) {
            split = "1";
        }
        System.out.println((long)(W*H/2.0) + " " + split);
    }    
}
