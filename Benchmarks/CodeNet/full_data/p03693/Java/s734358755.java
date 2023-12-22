import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println((s.nextInt()*100 + s.nextInt()*10 + s.nextInt()) % 4 == 0 ? "YES" : "NO");
    }
}
