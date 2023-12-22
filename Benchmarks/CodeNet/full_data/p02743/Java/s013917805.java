import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long c = sc.nextLong();
        System.out.println((Math.sqrt(a)+Math.sqrt(b))< Math.sqrt(c)?"Yes":"No");
    }
}