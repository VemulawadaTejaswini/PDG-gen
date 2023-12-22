import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int max = 1;
        for (int x = X / 2; x > 1; x--) {
            for (int y = X / 2; y > 1; y--) {
                double pow = Math.pow((double) x, (double) (y));
                if (pow > max && pow <= X) {
                    max = ((int) pow);
                }
            }
        }
        System.out.print(max);
    }
}
