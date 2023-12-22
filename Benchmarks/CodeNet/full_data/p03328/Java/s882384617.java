import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        a = scan.nextInt(); b = scan.nextInt();
        int dif = b - a;
        System.out.println(dif*(dif+1)/2-b);
    }
}
