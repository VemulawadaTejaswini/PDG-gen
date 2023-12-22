import java.util.Scanner;
     
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        double N = sc.nextDouble();

        if (N % 2 == 0) {
            System.out.println((N / 2)/N);
        } else {
            System.out.println((int)(N / 2 + 1)/N);
        }
    }
}