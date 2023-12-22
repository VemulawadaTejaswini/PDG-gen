import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        long N = Long.parseLong(values[0]);
        if (N == 1) {
            System.out.println("1");
            return;
        }
        long temp = N;
        long atks = 0;
        long n = 0;
        while (temp >= 1) {
            temp = temp / 2;
            n += Math.pow(2,atks);
            atks ++;
        }
        System.out.println(n);
    }
}