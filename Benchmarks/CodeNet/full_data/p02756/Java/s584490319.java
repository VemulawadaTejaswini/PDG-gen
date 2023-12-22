import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isReversed = false;

        StringBuilder sb = new StringBuilder(scanner.next());
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int t = scanner.nextInt();
            if (t == 1) {
                isReversed = !isReversed;
            } else {
                int f = scanner.nextInt();
                if (f == 1) {
                    if (isReversed) {
                        sb.append(scanner.next());
                    } else {
                        sb.insert(0, scanner.next());
                    }
                } else {
                    if (isReversed) {
                        sb.insert(0, scanner.next());
                    } else {
                        sb.append(scanner.next());
                    }
                }
            }
        }
        if (isReversed) {
            sb.reverse();
        }
        System.out.println(sb.toString());
    }
}