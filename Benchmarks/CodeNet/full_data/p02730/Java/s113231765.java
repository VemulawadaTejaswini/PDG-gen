import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        long start1 = System.currentTimeMillis();
//        long end1 = System.currentTimeMillis();
//        System.out.println("time1: " + (end1 - start1));

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int n = s.length();

        String s1 = s.substring(0, (n - 1) / 2);
        String s2 = s.substring((n + 3) / 2 - 1, n);

//        System.out.println("s1: " + s1);
//        System.out.println("s2: " + s2);

        if (check(s) && check(s1) && check(s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean check(String word) {
        StringBuffer sb = new StringBuffer(word);
        String reverse = sb.reverse().toString();
        return word.equals(reverse);
    }

}