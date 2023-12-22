import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void debug(String str){
        boolean debug = false;
        if(debug != true){
            return;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {

        int W;
        int H;
        int x;
        int y;

        try (Scanner sc = new Scanner(System.in)) {
            W = sc.nextInt();
            H = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

        }
        BigDecimal bw =new BigDecimal(W);
        BigDecimal bh =new BigDecimal(H);
        BigDecimal bm = bw.multiply(bh).divide(new BigDecimal(2));
        long a = W * H;
        debug(a + ":");
        double f = bm.doubleValue();
        int j = 0;
        if(x*2 == W && y *2 == H){
            j = 1;
        }
        System.out.println(String.format("%.6f", f) + " "+j);
    }


}
