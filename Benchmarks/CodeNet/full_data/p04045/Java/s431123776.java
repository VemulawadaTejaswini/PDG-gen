import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < 10; i++) {

            a.add(i);
        }
        //inputs
        for (int i = 0; i < k; i++) {
            a.remove(in.nextInt());
        }


        while (true) {
            int x = n / 1000;
            int z = n / 100 % 10;
            int s = n / 10 % 10;
            int q = n % 10;
            if (n >= 1000) {
                if (a.contains(x) && a.contains(z) && a.contains(s) && a.contains(q)) {
                    System.out.println(n);
                    break;
                }

            } else if (n >= 100) {
                if (a.contains(z) && a.contains(s) && a.contains(q)) {
                    System.out.println(n);
                    break;
                }

            } else if (n >= 10) {
                if (a.contains(s) && a.contains(q)) {
                    System.out.println(n);
                    break;
                }

            } else if (n < 10) {
                if (a.contains(n)) {
                    System.out.println(n);
                    break;
                }

            }else n++;


        }
    }
}