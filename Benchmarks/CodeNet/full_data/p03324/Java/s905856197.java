import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();


        int pow = (int)Math.pow(100, N);
        int res = pow * D;
        if (N == 100){
            res = res + 1 ;
        }
        System.out.println(res);

    }
}
