import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int ans = 0;
        String[] str = new String[4];
        str = s.split("");
        for (int i = 0; i < 4; i++) {
            if (str[i].equals("+"))
                ans++;
            else
                ans--;
        }
        System.out.println(ans);
    }
}