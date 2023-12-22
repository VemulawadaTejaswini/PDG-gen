import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A  =sc.nextInt();
        int B = sc.nextInt();
        long C = A*B;
        int r = 0;
        while (A%B!=0){
            r = A%B;
            A=B;
            B = r;
        }
        System.out.println(C/B);

    }
}
