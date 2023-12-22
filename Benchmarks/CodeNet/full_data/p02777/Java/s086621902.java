import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        String t = stdIn.next();
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        String u = stdIn.next();

        if (s.equals(u)) {
            a -= 1;
        } else {
            b -= 1;
        }

        System.out.println(a + " " + b);
    }
}
