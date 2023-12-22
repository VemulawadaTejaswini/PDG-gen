import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long tmp = n;
        while(true) {
            if(n % 2 == 0 && n % tmp == 0) {
                break;
            }
            n++;
        }
        System.out.println(n);
    }
}
