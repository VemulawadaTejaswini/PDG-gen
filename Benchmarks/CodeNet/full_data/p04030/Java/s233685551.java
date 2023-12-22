import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        char[] arr = sc.next().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] != 'B') {
                sb.append(arr[i]);
            } else {
                if (sb.length() != 0) {
                    sb.setLength(sb.length() - 1);
                }
            }
        }

        System.out.println(sb.toString());
    }

}

