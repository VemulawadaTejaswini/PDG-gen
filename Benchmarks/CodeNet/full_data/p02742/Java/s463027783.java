import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        if((long)W*(long)H % 2 == 0) {
            long K = ((long)H*(long)W / 2);
            System.out.println(K);
        }
        else {
            long K = ((long)H*(long)W / 2 + 1) ;
            System.out.println(K);
        }
    }
}