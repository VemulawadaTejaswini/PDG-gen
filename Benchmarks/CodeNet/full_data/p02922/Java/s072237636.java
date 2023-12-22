import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int powerstrip = sc.nextInt();
        int sockets = sc.nextInt();

        if (sockets == 1) {
            System.out.println(0);
            System.exit(0);
        }

        int socketNum = powerstrip;
        int counter = 1;
        while (socketNum < sockets) {
            socketNum += (powerstrip - 1);
            counter++;
        }

        System.out.println(counter);

    }
}