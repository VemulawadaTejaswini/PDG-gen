import java.util.ArrayList;
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

        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }
        sc.close();

        ArrayList<Integer> ab = new ArrayList<>();

        for (Integer ai : a) {
            for (Integer bi : b) {
                ab.add(ai + bi);
            }
        }

        int ans = 0;

        for (Integer abi : ab) {
            ans = ans ^ abi;
        }

        System.out.println(ans);
    }
}