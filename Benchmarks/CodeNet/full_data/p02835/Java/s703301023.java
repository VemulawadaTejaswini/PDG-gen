import java.io.*;
import java.util.*;

    public class Main extends PrintWriter {
        Main() { super(System.out, true); }
        Scanner sc = new Scanner(System.in);
        public static void main(String[] $) {
            Main o = new Main(); o.main(); o.flush();
        }

        void main(){
            int A = Integer.parseInt(sc.next());
            int B = Integer.parseInt(sc.next());
            int C = Integer.parseInt(sc.next());
            int D = A + B + C;
            if(D >= 22){
                print("bust");
            }
            else{
                print("win");
            }
    }
}
