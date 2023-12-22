import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int tmp = n / k;
        int tmp2 = n % k;
        if(tmp2 == 0) System.out.println(tmp2);
        else System.out.println(tmp - tmp2);
    }
}