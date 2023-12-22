import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;

        while(i <= N) {
            i *= 2;
        }
        System.out.println(i/2);
    }

}