
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        String[] a = new String[k];
        for (int i = 0; i < k; i++) {
            a[i] = in.nextLine();
        }

        for (int i = n; i < 10000; i++) {
            String b = Integer.toString(i);
            boolean contain = true;
            for (int j = 0; j < k; j++) {
                if (b.contains(a[j])) {
                    contain = false;
                    break;
                }
            }
            if (contain) {
                System.out.println(b);
                break;
            }


        }


    }
}