import java.util.Scanner;

public class Main {
    public static void main(String main[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((b/a)+(b%a));
    }
}