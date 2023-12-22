import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            ans.append(s.charAt(i));
            ans.append(t.charAt(i));
        }
        System.out.println(ans);
    }
}

