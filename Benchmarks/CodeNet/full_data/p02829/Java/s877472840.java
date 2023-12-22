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

            if(A != 1 && B != 1){
                print('1');
        }
            if(A != 2 && B != 2){
                print('2');
            }
            if(A != 3 && B != 3){
                print('3');
            }
    }
}
