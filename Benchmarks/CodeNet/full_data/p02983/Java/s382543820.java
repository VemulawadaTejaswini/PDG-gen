import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        int ans = 100000000;
        int num = 0;
        for (int i = l; i < r; i++) {
            num = permutation(r, i, i+1, 100000000);
            if (num < ans) {
                ans = num;
            }
        }
        System.out.println(ans);

    }

    private static int permutation(int R, int l, int r, int ans){
        if(R == r-1){
            return ans;
        }
        int temp = ans;
        for (int i = r; i <= R; i++) {
            int num = (r * l) % 2019;
            if (num < temp) {
                temp = num;
            }
        }
        r++;
        return permutation(R, l, r, temp);
    }
}