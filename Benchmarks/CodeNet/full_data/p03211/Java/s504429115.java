import java.util.*;

/**
 *
 * @author kouki
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        int[] syujin;
        syujin = new int[numbers.length() - 2];
        int min = 0;

        for (int i = 0; i < numbers.length() - 2; i++) {
            String runrun = "";
            runrun = numbers.substring(i, i + 3);
            //System.out.println(runrun);
            int runrun2 = Integer.parseInt(runrun);
            syujin[i] = 753 - runrun2;
        }
        min = syujin[0];
        for (int i = 0; i < syujin.length; i++) {
            //System.out.println(syujin[i]);
            if (min > syujin[i]) {
                min = syujin[i];
            }
        }

        System.out.println(min);
    }

}