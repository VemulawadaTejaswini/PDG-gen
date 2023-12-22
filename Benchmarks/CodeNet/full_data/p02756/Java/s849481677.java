import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String init = scanner.next();
        int queryCount = scanner.nextInt();

        StringBuilder builder = new StringBuilder(init);

        for (int i = 0; i < queryCount; i++) {
            int kind = scanner.nextInt();
            if (kind == 1) {
                builder.reverse();

            } else {
                int position = scanner.nextInt();
                String value = scanner.next();
                if (position == 1) {
                    builder.insert(0, value);
                } else {
                    builder.append(value);
                }
            }
        }

        System.out.println(builder.toString());
    }
}