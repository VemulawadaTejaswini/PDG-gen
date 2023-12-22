import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean result = true;
        String[] target = s.split("");
        for (int i = 0; i < target.length - 1 && result; i++) {
            if (i % 2 == 0) {
                result = "R".equals(target[i]) || "U".equals(target[i]) || "D".equals(target[i]);
            } else {
                result = "L".equals(target[i]) || "U".equals(target[i]) || "D".equals(target[i]);
            }
        }

        System.out.println(result ? "Yes" : "No");
    }
}
