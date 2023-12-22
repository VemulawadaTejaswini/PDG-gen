import java.util.Scanner;

public class Main {
    public Main () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        boolean four = false;

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        for (String i: s) {
            if (i.equals("Y"))
                four = true;
        }

        if (four) {
            System.out.println("Four");
        } else {
            System.out.println("Three");
        }
    }


    public static void main (String[] args) {
        new Main();
    }

}
