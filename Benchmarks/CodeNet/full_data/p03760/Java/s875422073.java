import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String o=sc.next();
        String e=sc.next();
        int index1 = 0;
        int index2 = 0;
        boolean flag = true;
        while (index1 < o.length() || index2 < e.length()) {
            if (flag) {
                System.out.print(o.charAt(index1++));
            } else {
                System.out.print(e.charAt(index2++));
            }

            flag = !flag;
        }
    }
}