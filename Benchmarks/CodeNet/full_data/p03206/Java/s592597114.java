import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int i = 25 - Integer.parseInt(sc.next());
        String ans = "Christmas";
        for (int j = 0; j < i; j++) {
            ans += " Eve";
        }
        System.out.println(ans);
    }
}