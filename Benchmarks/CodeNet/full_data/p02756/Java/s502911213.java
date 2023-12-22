import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(sc.next());
        int q = sc.nextInt();

        for (int i = 0; i < q ; i++) {
            if (sc.nextInt() == 1) {
                builder.reverse();
            } else {
                if (sc.nextInt() == 1) {
                    builder.insert(0, sc.next());
                } else {
                    builder.append(sc.next());
                }
            }
        }
        System.out.println(builder);
    }
}
