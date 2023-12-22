import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr);

        int children = 0;
        for (int i = 0; i < n; i++) {

            if (x < aArr[i]) break;

            x -= aArr[i];
            children++;
        }

        if (x > 0 && children > 0) children--;

        System.out.println(children);
    }
}
