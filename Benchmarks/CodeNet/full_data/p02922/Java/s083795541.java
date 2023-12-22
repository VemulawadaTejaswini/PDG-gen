import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = Float.parseFloat(sc.next());
        float B = Float.parseFloat(sc.next());

        System.out.println((int) Math.ceil(B / A));
    }
}