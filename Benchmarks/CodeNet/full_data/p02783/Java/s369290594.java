import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();

    }

    public void kiriage(int h, int a) {
        int c = (h + (a - 1)) / h;
        System.out.println(c);
    }

}
