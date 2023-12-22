import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int nowA = a - b;

        int nowc = c - nowA;

        if ( nowc < 0) {
            System.out.print(0);
        }else {
            System.out.print(nowc);
        }

    }


}

