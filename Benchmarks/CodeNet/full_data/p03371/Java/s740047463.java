import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        long ans = Long.MAX_VALUE;

        for (int i = 0; i <= Math.max(x*2, y*2); i+=2) {
          long tmp = c*i + a*(Math.max(0,x-i/2)) + b*(Math.max(0,y-i/2));
          ans = Math.min(tmp, ans);   
        }

        System.out.println(ans);
        sc.close();
    }
}