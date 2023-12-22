import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[]$) {
        Scanner sc = new Scanner(in);
        int sx=sc.nextInt();
        int sy=sc.nextInt();
        int tx=sc.nextInt();
        int ty=sc.nextInt();
        for (int i = 0; i <tx-sx ; i++) {
            out.print("R");
        }
        for (int i = 0; i <ty-sy ; i++) {
            out.print("U");
        }
        for (int i = 0; i <ty-sy ; i++) {
            out.print("L");
        }
        for (int i = 0; i <tx-sx ; i++) {
            out.print("D");
        }
        out.print("D");
        for (int i = 0; i <tx-sx+1 ; i++) {
            out.print("U");
        }
        out.print("L");
        out.print("U");
        for (int i = 0; i <tx-sx ; i++) {
            out.print("L");
        }
        for (int i = 0; i <ty-sy+1 ; i++) {
            out.print("D");
        }
        out.println("R");
    }
}