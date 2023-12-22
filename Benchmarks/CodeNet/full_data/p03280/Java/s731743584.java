import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int AB = A * B;
        int R = (A + B - 1);

            System.out.println(AB - R);

    }
}
