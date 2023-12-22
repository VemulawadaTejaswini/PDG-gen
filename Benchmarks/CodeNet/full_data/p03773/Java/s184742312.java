import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();

        if ((a >= 0 && a <= 23) && (b >= 0 && b <= 23)) {

            int time = a + b;

            if (time >= 24) {

                int time1 = time - 24;

                System.out.println(time1);
                
            } else {

                System.out.println(time);
            }
        }
    }
}
