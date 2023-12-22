import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        int left[] = new int[S.length()+1];
        int right[] = new int[S.length()+1];

        int c = 0;
        for (int i=0; i<S.length(); i++) {
            if ("<".equals(S.substring(i, i+1))) {
                left[i] = c;
                left[i+1] = c+1;
                c++;
            } else {
                c = 0;
            }
        }
        c = 0;
        for (int i=S.length()-1; i>=0; i--) {
            if (">".equals(S.substring(i, i+1))) {
                right[i] = c+1;
                right[i+1] = c;
                c++;
            } else {
                c = 0;
            }
        }
        for (int i=0; i<S.length(); i++) {
            if (left[i]<right[i])
                left[i] = right[i];
        }
        

        int sum = Arrays.stream(left).sum();
        PrintWriter out = new PrintWriter(System.out);
        out.println(sum);
        out.flush();
    }
}