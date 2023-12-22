import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 5){
            System.out.println("0");
            return;
        }
        int sum = 0;
        while (n > 4){
            if (n / 500 > 0){
                sum += n / 500 * 1000;
                n %= 500;
            }
            if(n > 4){
                sum += n / 5 * 5;
                n %= 5;
            }
        }
        System.out.print(sum);
    }

}
