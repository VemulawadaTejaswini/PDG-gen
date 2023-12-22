import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int ans = 0;
        String s = sc.next();
        for (Character c : s.toCharArray()) {
            if (c.equals('1'))
                ans++;
        }

        System.out.println(ans);
        sc.close();
    }
}
