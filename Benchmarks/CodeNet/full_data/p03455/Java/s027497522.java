import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ab = Integer.valueOf(sc.next() + sc.next());

        double sqrt = Math.sqrt(ab);
        final String result;
        if (sqrt % 1 == 0) {
            result = "Yes";
        } else {
            result = "No";
        }
        System.out.println(result);
        sc.close();
    }
}