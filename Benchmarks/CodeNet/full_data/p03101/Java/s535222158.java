import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        String[] in2 = s.nextLine().split(" ");
        int bigH = Integer.parseInt(in[0]);
        int bigW = Integer.parseInt(in[1]);
        int h = Integer.parseInt(in2[0]);
        int w = Integer.parseInt(in2[1]);
        int r = bigH*bigW;
        r -= h*bigW+(w*bigH-h*w);
        System.out.println(r);
    }
}