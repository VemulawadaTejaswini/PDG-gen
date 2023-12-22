import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        System.out.println(a[0]==b[2]&&a[1]==b[1]&&a[2]==b[0]?"YES":"NO");
    }
}
