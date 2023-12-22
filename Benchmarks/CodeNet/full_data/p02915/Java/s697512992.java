import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int ans = (int) Math.pow(N, 3);
        System.out.println(ans);
    }

}
