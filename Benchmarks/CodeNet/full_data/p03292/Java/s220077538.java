import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int aa[] = {a, b, c};
        Arrays.sort(aa);
        int ans = 0;
        for (int i = 1; i < 3; i++) {
            ans += (aa[i] - aa[i - 1]);
        }
        System.out.println(ans);
        inp.close();
    }
}
