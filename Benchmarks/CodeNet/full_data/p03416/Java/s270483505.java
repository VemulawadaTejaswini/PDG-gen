import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        for (int i = a; i <= b; i++) {
            String s = String.valueOf(i);
            String before = s.substring(0, 2);
            String after = s.substring(3, 5);
            if (before.equals(after)) {
                result++;
            }
        }
        System.out.println(result);
    }
}