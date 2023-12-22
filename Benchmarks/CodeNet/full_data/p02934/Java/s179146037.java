import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        String[] values = sc.nextLine().split(" ");
        sc.close();
        double sum = 0;
        for (int i = 0; i < num; i++) {
            sum += 1.0 / Integer.parseInt(values[i]);
        }
        System.out.println(1.0 / sum);
    }
}