import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC149E - Handshake

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();

        int[] a = new int[n];

        long kofuku = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        ArrayList<Integer> ptn = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                ptn.add(a[j] + a[k]);
            }
        }

       for (Object pw : ptn.stream().sorted(Comparator.reverseOrder()).limit(m).toArray()) {
            kofuku += (Integer)pw;
        }

        System.out.println(kofuku);
    }
}