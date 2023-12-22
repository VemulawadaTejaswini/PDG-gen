import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int plus = a + b;
        int mainasu = a - b;
        int jyozan = a * b;
        int anserw = 0;
        if (plus > mainasu) {
            anserw = plus;
        } else {
            anserw = mainasu;
        }
        if (anserw > jyozan ) {
            System.out.print(anserw);
        } else {
            System.out.print(jyozan);
        }

    }
}

