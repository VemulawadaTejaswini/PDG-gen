import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = in.nextInt(), N = in.nextInt();
        long p = (long)Math.pow(100,D)*N;
        System.out.println(p);
    }
}