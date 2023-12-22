import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String b = sc.next();
        System.out.println(a < 3200 ? "red" : b);


    }

}
