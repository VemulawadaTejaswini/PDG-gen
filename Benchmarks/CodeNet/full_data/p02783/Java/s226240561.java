import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = 0;
        if(h%a !=0) b = 1;
        System.out.println(h/a+b);
    }
}