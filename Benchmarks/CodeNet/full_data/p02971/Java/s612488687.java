import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        ArrayList<Integer> b = new ArrayList<>();
        b.addAll(a);
        Collections.sort(b);
        int max = b.get(b.size() - 1);
        int max2 = b.get(b.size() - 2);
        for (int i = 0; i < n; i++) {
            int tmp = a.get(i);
            if(max == tmp) {
                System.out.println(max2);
            } else {
                System.out.println(max);
            }
        }
    }
}