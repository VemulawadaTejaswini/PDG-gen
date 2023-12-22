import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] cs = sc.nextLine().toCharArray();

        boolean flagA = true;

        //偶数
        for (int i = 0; i < cs.length; i+=2) {
            if (cs[i] == 'L') {
                flagA = false;
                break;
            }
        }

        boolean flagB = true;
        //奇数
        for (int i = 1; i < cs.length; i+=2) {
            if (cs[i] == 'R') {
                flagB = false;
                break;
            }
        }
        if (flagA && flagB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
