import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(r * r * 3);
    }

}