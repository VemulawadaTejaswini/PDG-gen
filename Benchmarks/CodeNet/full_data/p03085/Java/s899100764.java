import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //        int a = sc.nextInt();
        //        int b = sc.nextInt();

        String b = sc.next();

        sc.close();

        //        boolean ans = false;
        //
        //        for (int i = 0; i < a; i++) {
        //
        //        }

        //        System.out.println(ans ? "YES" : "NO");
        if (b.equals("A")) {
            System.out.println("T");
        } else if (b.equals("T")) {
            System.out.println("A");
        } else if (b.equals("C")) {
            System.out.println("G");
        } else {
            System.out.println("C");
        }
    }
}