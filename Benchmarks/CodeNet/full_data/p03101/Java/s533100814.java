import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        int h = sc.nextInt();
        int w = sc.nextInt();

        sc.close();

        int ans = (H - h) * (W - w);

        System.out.println(ans);
    }

}