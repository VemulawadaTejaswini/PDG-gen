import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);

        int p = s.nextInt(); // A<=>B
        int q = s.nextInt(); // B<=>C
        int r = s.nextInt(); // C<=>A

        int pq = p + q;
        int pr = p + r;
        int qr = r + q;

        if (pq == Math.min(Math.min(pq, pr), qr)) {
            System.out.println(pq);
        } else if (pr == Math.min(Math.min(pq, pr), qr)) {
            System.out.println(pr);
        } else {
            System.out.println(qr);
        }
    }
}
