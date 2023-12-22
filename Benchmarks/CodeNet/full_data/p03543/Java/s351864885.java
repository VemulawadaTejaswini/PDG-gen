import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] n = sc.next().toCharArray();
        int count = 0;
        int ans = 0;
        for (int i = 0; i < n.length - 1; i++) {
            if(n[i] == n[i + 1]) {
                count++;
                if(ans < count) {
                    ans = count;
                }
            } else {
                count = 0;
            }
        }
        if(ans >= 2) System.out.println("Yes");
        else System.out.println("No");
    }
}