import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
        }

//        int max = h[0];
        boolean nflag = false;
        for (int i = 0; i < n-1; i++) {
            int res = h[i]-h[i+1];
//            if(max < h[i]) max = h[i];
            if(res > 1) {
                nflag = true;
                break;
            } else if (res == 1) {
                h[i]--;
                if(i>1) {
                    if(h[i-1] > h[i]) {
                        nflag = true;
                        break;
                    }
                }
            }
        }
        if(nflag) {
            out.print("No");
        } else {
            out.print("Yes");
        }

        out.flush();

    }

}
