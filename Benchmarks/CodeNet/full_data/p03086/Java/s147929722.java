import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = {'A','C','G','T'};
        int ans = 0;
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < c.length; j++) {
                if (s.substring(i, i + 1).equals(String.valueOf(c[j]))) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                temp++;
                flag = false;
                ans = Math.max(ans, temp);
            } else {
                temp = 0;
            }

        }
        System.out.println(ans);
    }
}