import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        String s  = sc.next();
        char[] arr = s.toCharArray();

        for (int i=0; i<s.length()/2; i++) {
            if (i!=s.length()-1 && arr[i]!=arr[s.length()-1]) {
                out.print("No");
                out.flush();
                return;
            }
        }

        if ((s.length()/2)%2==0) {
            for (int i=0; i<s.length()/2-1; i++) {
                if (arr[i]!=arr[(s.length()/2)-1-i]) {
                    out.print("No");
                    out.flush();
                    return;
                }
                if (arr[(s.length()/2)+1+i]!=arr[(s.length())-1-i]) {
                    out.print("No");
                    out.flush();
                    return;
                }
            }
        } else {
            for (int i=0; i<s.length()/2-1; i++) {
                if (i!=(s.length()/2)-1-i && arr[i]!=arr[(s.length()/2)-1-i]) {
                    out.print("No");
                    out.flush();
                    return;
                }
                if ((s.length()/2)+1+i!=(s.length())-1-i && arr[(s.length()/2)+1+i]!=arr[(s.length())-1-i]) {
                    out.print("No");
                    out.flush();
                    return;
                }
            }
        }

        out.print("Yes");
        out.flush();
    }

}
