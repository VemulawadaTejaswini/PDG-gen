import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] array = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i % 2 == 0) {
                if (array[i] == 'R' || array[i] == 'U' || array[i] == 'D') {
                    cnt++;
                }
            } else {
                if (array[i] == 'L' || array[i] == 'U' || array[i] == 'D') {
                    cnt++;
                }
            }
        }
        if (cnt == array.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
