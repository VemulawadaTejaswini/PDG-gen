
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            int Q = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < Q && scanner.hasNextLine(); ++i) {
                String[] array = scanner.nextLine().split(" ");
                long A = Integer.parseInt(array[0]);
                long B = Integer.parseInt(array[1]);
                long mul = A * B;

                int r = 0;
                long c = mul;

                while (true) {
                    int w = r + 1;
                    if (w == A) {
                        ++w;
                    }
                    long o = mul / w;
                    if (o * w == mul) {
                        --o;
                    }
                    if (o >= c) {
                        c = c - 1;
                    } else {
                        c = o;
                    }
                    if (c == B) {
                        --c;
                    }
                    if (c <= 0) {
                        System.out.println(r - 1);
                        break;
                    }
                    r = w;
                }
            }
        }
    }
}