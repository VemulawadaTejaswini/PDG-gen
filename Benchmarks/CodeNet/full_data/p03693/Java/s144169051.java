import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int rgb = r*100 + g*10 + b*1;

        System.out.println(rgb%4 == 0 ? "YES" : "NO");
    }

}
