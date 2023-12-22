import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public void main() {
        Scanner sc = new Scanner(new InputStreamReader(System.in));

        char a = Character.toUpperCase(sc.next().charAt(0));
        char b = Character.toUpperCase(sc.next().charAt(0));
        char c = Character.toUpperCase(sc.next().charAt(0));

        println("" + a + b + c);
    }

    public void print(Object o) {
        System.out.print(o);
    }

    public void println(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        new Main().main();
    }
}
