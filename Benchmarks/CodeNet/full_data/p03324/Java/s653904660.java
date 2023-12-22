import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int n = input.nextInt();
        if (n == 100){
            n++;
        }
        System.out.println(rightLeadingZero(n, d * 2));
    }
    public static String rightLeadingZero (int number, int count){
        StringBuilder out = new StringBuilder(String.valueOf(number));
        for (int i = 0; i < count; i++) {
            out.append(0);
        }

        return out.toString();
    }
}
