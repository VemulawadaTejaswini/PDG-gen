
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer x = Integer.parseInt(scanner.next());

        Integer[] l = new Integer[n];
        Integer[] d = new Integer[n + 1];

        for(int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(scanner.next());
        }

        d[0] = 0;
        for(int i = 0; i < l.length; i++) {
            d[i+1] = d[i] + l[i];
        }

        int count = 0;
        for(int i = 0; i < d.length; i++) {
            if(d[i] <= x) count++;
        }

        System.out.println(count);
    }
}
