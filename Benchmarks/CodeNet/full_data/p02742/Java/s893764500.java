import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        System.out.println(H/2*W+(H%2==0 ? 0 : (W+1)/2));
    }
}
