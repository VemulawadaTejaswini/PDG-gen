import java.util.Scanner;

class Atcoder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        String c = b.concat(a);
        System.out.println(c);
    }
}
