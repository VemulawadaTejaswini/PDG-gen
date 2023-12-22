import java.util.*;

public class Main {
    public void main(Scanner sc) {
        System.out.println(sc.next().matches("^A[a-z]+C[a-z]+$") ? "AC" : "WA");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
