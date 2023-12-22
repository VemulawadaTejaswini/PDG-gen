import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextInt();
        long W = sc.nextInt();

        if (H == 1 || W == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(H/2*W+(H%2==0 ? 0 : (W+1)/2));
    }
}
