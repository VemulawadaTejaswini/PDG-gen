import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        Integer[] gram = new Integer[11];
        gram[0] = x;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            gram[i] = r * gram[i - 1] - d;
            sb.append(gram[i]);
            if (i <10) {
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}