import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        int rl = r.length();

        String r0 = r.substring(0, 0);
        String a = "A";

        String rb = r.substring(2, rl);

        int c1 = rb.indexOf("C");
        int cn = rb.lastIndexOf("C");


        if (a.equals(r0)) {
            if (c1 != -1 && cn != -1) {
                if (c1 != cn) {
                    System.out.println("WA");
                } else {
                    for (int i = 1; i <= rl && i != c1; i++) {
                        if (Character.isLowerCase(i)) {
                            System.out.println("AC");
                        }
                    }
                }

            } else {
                System.out.println("WA");
            }
        } else {
            System.out.println("WA");
        }


    }

}


