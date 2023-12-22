import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Double r = Double.parseDouble(sc.next());
        double r2 =  r * r * 3.14;
        int result = (int)(r2 / 3.14);
        System.out.println(result);
    }
}