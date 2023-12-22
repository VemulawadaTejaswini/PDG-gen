import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        String S = scanner.next();
        scanner.close();

        StringBuilder sb = new StringBuilder(S);
        StringBuilder sb2 = new StringBuilder(S.toLowerCase());

        sb.setCharAt(K-1,sb2.charAt(K-1));

        System.out.println(sb.toString());

//        System.out.println(System.currentTimeMillis() - startTime);
    }
}
