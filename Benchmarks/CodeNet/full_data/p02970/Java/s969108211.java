import java.util.Scanner;
 
class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int d = sc.nextInt()+1;

        int ans = 0;
        for (int i = 1; i <= n; i++) {
          if (i%d==0) {
            ans++;
          }
          if ((i + d) >=n) {
            break;
          }
        }
        System.out.println(ans);
      }
}
