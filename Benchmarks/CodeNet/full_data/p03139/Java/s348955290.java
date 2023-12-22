import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = Math.min(a, b);
        int y = Math.max(0, a + b - n);
        System.out.println(x + " " + y);
    }

}
