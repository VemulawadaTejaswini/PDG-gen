import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        String b = sc.next();
        int ri = sc.nextInt();
        int bi = sc.nextInt();
        String rs = sc.next();
        if (rs.equals("red")) {
            ri = ri - 1;
        } else {
            bi = bi -1;
        }
        System.out.println(ri + " " + bi);
    }
}
