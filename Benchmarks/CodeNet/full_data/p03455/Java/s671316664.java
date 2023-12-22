import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        String s = String.valueOf(a) + String.valueOf(b);

        int c = Integer.parseInt(s);

        boolean isSqare = false;

        for (int i = 2; i < c; i++) {
            if (c % i == 0) {
                System.out.println("Yes");
                isSqare = true;
            }
        }

        if (!isSqare)
            System.out.println("No");
    }
}