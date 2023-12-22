import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax8 = sc.nextInt();
        int taxB10 = sc.nextInt();

        int exTax8 = tax8*100/8;
        int exTax10 = taxB10*10/10;

        if(exTax8 == exTax10) {
            System.out.println(exTax8);
        } else {
            System.out.println(-1);
        }
    }
}
