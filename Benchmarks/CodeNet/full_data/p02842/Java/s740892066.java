import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tax_ex = (int) Math.ceil(n/1.08);
        int tax_in = (int) Math.floor(tax_ex*1.08);
        System.out.println(n==tax_in ? tax_ex : ":(");
    }
}