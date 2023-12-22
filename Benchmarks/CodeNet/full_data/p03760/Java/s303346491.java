import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public void main() {
        Scanner sc = new Scanner(new InputStreamReader(System.in));

        String os[] = sc.nextLine().split("");
        String es[] = sc.nextLine().split("");

        for (int i = 0; i < es.length; i++) {
            print(os[i]);
            print(es[i]);
        }

        if (os.length != es.length) {
            print(os[os.length - 1]);
        }

        println("");
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
