import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
        a = swap(b, b=a);
        a = swap(c, c=a);

        System.out.println(a + "" + b + "" + "" + c);
    }

    public static int swap(int... args) {
        return args[0];
    }
}
