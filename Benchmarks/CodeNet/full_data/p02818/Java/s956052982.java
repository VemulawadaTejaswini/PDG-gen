import java.io.*;
import java.util.*;

    public class Main extends PrintWriter {
        Main() { super(System.out, true); }
        Scanner sc = new Scanner(System.in);
        public static void main(String[] $) {
            Main o = new Main(); o.main(); o.flush();
        }

        void main(){
            long A = sc.nextLong();
            long B = sc.nextLong();
            long K = sc.nextLong();
            if(A < K){
                K = K - A;
                A = 0;
            }
            else{
                A = A - K;
                K = 0;
            }
            if(B > K){
                B = B - K;
            }
            else{
                B = 0;
            }
            print(A + " "  + B);
    }
}
