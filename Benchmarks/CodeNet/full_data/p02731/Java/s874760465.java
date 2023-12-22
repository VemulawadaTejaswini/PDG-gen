import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        double n=scn.nextInt();
        n/=3;

        System.out.printf("%.12f",n*n*n);

    }

}
