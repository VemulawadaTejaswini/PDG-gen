import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String...args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] poinst = new int[n];
        for (int i = 0; i < poinst.length; i++){
            poinst[i] = k - q;
        }
        for(int i = 0; i < q ; i++) {
            int a = in.nextInt();
            poinst[a - 1] = poinst[a - 1] + 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < poinst.length; i++) {
            if(poinst[i] > 0) {
                sb.append("Yes" + System.lineSeparator());
            } else {
                sb.append("No" + System.lineSeparator());
            }
        }
        System.out.print(sb.toString());
    }
}
