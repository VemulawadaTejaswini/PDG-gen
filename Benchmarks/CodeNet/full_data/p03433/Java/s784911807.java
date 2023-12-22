import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long A = sc.nextInt();
        long i;
        while(N>500){
            N=N-500;
        }
        if (A > N) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}