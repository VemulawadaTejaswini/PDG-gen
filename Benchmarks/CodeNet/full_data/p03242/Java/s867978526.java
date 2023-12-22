import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int a = n / 100;
        if (a == 1){
            a = 9;
        }else if (a == 9){
            a = 1;
        }

        int b = (n / 10) % 10;
        if (b == 1){
            b = 9;
        }else if (b == 9){
            b = 1;
        }

        int c = n % 10;
        if (c == 1){
            c = 9;
        }else if (c == 9){
            c = 1;
        }

        int result = a * 100 + b * 10 + c;
        System.out.println(result);
    }
}