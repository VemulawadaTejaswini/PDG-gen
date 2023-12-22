import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();
        char c = s.charAt(k-1);
        c += 32;
        String a = s.substring(0 ,k-1) + c + s.substring(k ,s.length());
        System.out.println(a);
    }
}
