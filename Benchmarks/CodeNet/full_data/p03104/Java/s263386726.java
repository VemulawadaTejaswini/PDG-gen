import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long ans = A;
        for (Long i=A+1; i<=B; i++) {
            //System.out.println(ans + ", " + i);
            ans = ans ^ i;
        }
        System.out.println(ans);
    }

}
