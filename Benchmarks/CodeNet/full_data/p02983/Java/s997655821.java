
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j; k++) {
            for(int l = k+i;l <=j;l++){
                if(k != l && k*l%2019 < min) min = k*l%2019;
            }
        }
        System.out.println(min);
    }
}
