import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int L = sc.nextInt();
        int r, l;
        int sum = 0;
        int ans = 2018;
        if(L-R>2019)System.out.print("0");
        for (int i = R; i < L; i++) {
            r = i % 2019;
            for (int j = i; j <= L; j++) {
                if (i != j) {
                    if (ans == 2018) {
                        ans = (i % 2019) * (j % 2019);
                        sum = ans;
                    }
                    sum += r;
                    if (sum > 2019) {
                        sum = sum % 2019;
                        if (ans > sum) {
                            ans = sum;
                        }
                    }
                }
            }
        }
        System.out.print(ans);
    }

}
