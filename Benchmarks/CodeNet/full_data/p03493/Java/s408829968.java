import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String token = sc.next();
        String[] strArray = token.split("");

        int result = 0;

        if (strArray[0].equals("1")) {
            result++;
        }

        if (strArray[1].equals("1")) {
            result += 1;
        }

        if (strArray[2].equals("1")) {
            result += 1;
        }

        System.out.println(result);

        sc.close();
    }
}
