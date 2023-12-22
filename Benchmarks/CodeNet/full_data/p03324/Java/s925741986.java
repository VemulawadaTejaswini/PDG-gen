import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        if(N == 0){
            System.out.println(D);
            return;
        }

        int pow = (int)Math.pow(100, N);
        int res = pow * D;
        System.out.println(res);

    }
}
