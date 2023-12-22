import java.util.Scanner;

/**
 *
 * @author Colors
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int x[] = new int[n];
        long ans = 0L;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int chooseCard[] = new int[i + 1];
            for (int j = 0; j < chooseCard.length; j++) {
                chooseCard[j] = j;
            }
            int ave = 0;
            for (int j = 0; j < chooseCard.length; j++) {
                ave += x[chooseCard[j]];
            }
            ave /= chooseCard.length;
            if (ave == a) {
                ans++;
            }
            for (int j = 1; j < chooseCard.length; j++) {
                if (chooseCard[chooseCard.length] == n) {
                    if (chooseCard[chooseCard.length - j] + 1 < chooseCard[chooseCard.length - j - 1]) {
                        chooseCard[chooseCard.length - j]++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

}