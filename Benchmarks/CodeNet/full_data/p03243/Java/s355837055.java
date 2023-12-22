
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = (n - 1) / 111 + 1;
        n *= 111;
        System.out.println(n);
    }


}



