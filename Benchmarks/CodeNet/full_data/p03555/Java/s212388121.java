import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] top = sc.next().toCharArray();
        char[] bottom = sc.next().toCharArray();

        boolean ans = true;
        for (int i = 0, j = top.length - 1; i < top.length && j >= 0; i++, j--) {
            if (top[i] != bottom[j]) {
                ans = false;
                break;
            }
        }


        if (ans)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
