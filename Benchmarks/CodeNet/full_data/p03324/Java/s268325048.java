import java.util.Scanner;

public class A101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int num = in.nextInt();
        in.close();
        for (int i = 0; i < time; i++) {
            num *= 100;
        }
        System.out.println(num);
    }
}