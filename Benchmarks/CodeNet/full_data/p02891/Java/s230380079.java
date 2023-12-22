import java.util.Scanner;

public class Main {
    static StringBuilder S;
    static Character[] c;
    static int K;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        S = new StringBuilder(scanner.nextLine());
        K = scanner.nextInt();
        scanner.close();
    }


    public static void main(String args[]) {
        init();


        long count = 0;
        for(int i = 0; i < S.length() - 1; i+=2) {
            int cur = S.charAt(i);
            int next = S.charAt(i + 1);

            boolean update = false;
            while (next == cur) {
                update = true;
                cur++;
            }
            S.setCharAt(i, (char) cur);
            if(update) count++;
        }

        System.out.println(count * K);

    }
}
