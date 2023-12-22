import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int same = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {

            } else {
                same++;
            }
        }
        int ans = Math.min(n - 1, same + k * 2);
        System.out.println(ans);
        sc.close();
    }
}
