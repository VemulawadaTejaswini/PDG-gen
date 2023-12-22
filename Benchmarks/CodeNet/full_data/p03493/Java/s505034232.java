import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        int one;
        int p = 0;
        int m = 0;

        Scanner scanner = new Scanner(System.in);
        one = scanner.nextInt();

        if (one == 1) {
            p++;
        } else {
            m = 0;
        }
        
        System.out.println(p + m);

        scanner.close();
    }
}
