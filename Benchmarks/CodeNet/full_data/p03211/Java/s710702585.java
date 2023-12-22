import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int love = 753;
        int minDiff = 10000;

        for (int i = s.length() - 3; i >= 0; i--) {
            String sub = s.substring(i, i+3);
            int n = Integer.valueOf(sub);
            int diff = Math.abs(love - n);
            if (minDiff > diff)
                minDiff = diff;
        }
        System.out.println(minDiff);
    }
}
