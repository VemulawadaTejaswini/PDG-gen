import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        String[] ss = new String[N];
      
        for (int i = 0; i < N; i++) {
            String city = sc.next();
            int point = Integer.parseInt(sc.next());
            int index = i + 1;
            ss[i] = city + " " + (100 - point) + " " + index;
        }
      
        Arrays.sort(ss);

        for (String s : ss) {
            out.println(s.split(" ")[2]);
        }
        
        out.flush();
    }
}