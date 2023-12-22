import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();

        for (int i = 0; i < a.length() + b.length() - 2; i++) {
            System.out.print(charArray1[i]);
            System.out.print(charArray2[i]);
        }
        System.out.println("");

    }
}