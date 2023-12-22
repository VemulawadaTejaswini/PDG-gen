import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean isContinue = true;
        int n = /** Integer.parseInt(sc.nextLine()) */
                6;
        String[] list = /** sc.nextLine().split(" ") */
                { "382253568", "723152896", "37802240", "379425024", "404894720", "471526144" };
        sc.close();
        while (isContinue) {
            for (int i = 0; i < n; i++) {
                Integer val = Integer.parseInt(list[i]);
                if (val % 2 == 0) {
                    list[i] = String.valueOf(val / 2);
                } else {
                    isContinue = false;
                    break;
                }
            }
            if (isContinue) {
                count++;
            }
        }
        System.out.println(count);
    }
}