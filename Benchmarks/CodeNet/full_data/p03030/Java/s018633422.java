
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n];
        int[] p = new int[n];
        Pair[] pairs = new Pair[n];
        for (int i = 0 ; i < n ; i++) {
            s[i] = sc.next();
            p[i] = sc.nextInt();
            Pair pp = new Pair();
            pp.from = s[i];
            pp.end = p[i];
            pp.num = i + 1;
            pairs[i] = pp;
        }

        Arrays.sort(pairs);

        for (int i = 0 ; i < n ; i++ ) {
            System.out.println(pairs[i].num);
        }



    }



}

class Pair implements Comparable {
    String from;
    int end;
    int num;
    @Override
    public int compareTo(Object other) {
        Pair otherpair = (Pair) other;
        int aa = from.compareTo(otherpair.from);
        if (aa != 0) {
            return from.compareTo(otherpair.from);
        } else {
            return otherpair.end - end;
        }


    }
}