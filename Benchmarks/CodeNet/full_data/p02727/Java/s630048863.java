import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        List<Integer> red = new ArrayList<Integer>();
        List<Integer> green = new ArrayList<Integer>();
        List<Integer> white = new ArrayList<Integer>();
        for (int i=0; i<A; i++) {
            red.get(sc.nextInt());
        }
        for (int i=0; i<B; i++) {
            green.get(sc.nextInt());
        }
        for (int i=0; i<C; i++) {
            white.get(sc.nextInt());
        }
        Collections.sort(red, Collections.reverseOrder());
        Collections.sort(green, Collections.reverseOrder());
        Collections.sort(white, Collections.reverseOrder());
        List<Integer> all = new ArrayList<Integer>();
        all.addAll(red.subList(0, X));
        all.addAll(green.subList(0, Y));
        all.addAll(white.subList(0, Math.min(X+Y, white.size())));
        Collections.sort(all, Collections.reverseOrder());
        int sum = 0;
        for (int x: all.subList(0, X+Y)) {
            sum += x;
        }
        System.out.println(sum);
    }
}