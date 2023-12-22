import java.io.*;
import java.util.*;

    public class Main extends PrintWriter {
        Main() { super(System.out, true); }
        Scanner sc = new Scanner(System.in);
        public static void main(String[] $) {
            Main o = new Main(); o.main(); o.flush();
        }

        void main(){
            long K = sc.nextLong();
            long X = sc.nextLong();

            long T = K * 500;

            if(T >= X){
                print("Yes");
            }
            else{
                print("No");
            }


    }
}
