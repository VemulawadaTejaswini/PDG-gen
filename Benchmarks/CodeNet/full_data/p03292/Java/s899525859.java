import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] ans = {Math.abs(a - b), Math.abs(b - c), Math.abs(c - a)};
        Arrays.sort(ans);

        System.out.println(ans[0] + ans[1]);
   }
}