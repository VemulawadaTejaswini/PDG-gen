import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double x = 0.0;
        String u = "";
        double sum = 0;
        for (int i = 0; i < count; i++) {
            x = sc.nextDouble();
            u = sc.nextLine().trim();
            if (u.equals("JPY")) {
                sum += x;
            } else {
                x = x * 380000.0;
                sum += x;
            }
        }
        System.out.println(sum);

    }
}