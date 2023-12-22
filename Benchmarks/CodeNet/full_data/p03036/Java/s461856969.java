import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long r = scanner.nextLong();
        long D = scanner.nextLong();
        long tmp = scanner.nextLong();

        long ans = r * tmp - D;

        for(int i=0; i<10; i++){
            System.out.println(ans);
            ans = r * ans - D;
        }
    }
}
