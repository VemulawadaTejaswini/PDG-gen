import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s;

        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        int ans = 0;
        for(int i=0; i<4; i++) {
            if (s.charAt(i) == '+') ans++;
            else ans--;
        }

        System.out.println(ans);
    }
}