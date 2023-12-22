import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] pairs = new Pair[n];
        for (int i = 0 ; i < n ; i++) {
            Pair p = new Pair();
            p.no = i + 1;
            p.town = sc.next();
            p.point = sc.nextInt();
            pairs[i] = p;
        }
        Arrays.sort(pairs);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(pairs[i].no);
        }
    }

}

class Pair implements Comparable {
    int no;
    String town;
    int point;
    @Override
    public int compareTo(Object other) {
        Pair otherpair = (Pair) other;
        if (otherpair.town.equals(town)) {
            return otherpair.point - point;
        }
        return town.compareTo(otherpair.town);
    }
}