import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        i = sc.nextInt();
        j = sc.nextInt();
        if ((i + j) % 2 == 0) {
            System.out.println((i + j) / 2);
        } else {
            System.out.println((i + j) / 2 + 1);
        }

    }

}