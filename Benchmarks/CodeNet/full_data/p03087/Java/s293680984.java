import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        for(int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;

            int ans = 0;
            for(int j = l; j <= r - 1; j++) {
                if(s.substring(j, j + 2).equals("AC")) ans++;
            }
            System.out.println(ans);
        }

        sc.close();
    }
}