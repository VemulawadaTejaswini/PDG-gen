import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S = sc.next();
        String ans = "No";
        if(S.substring(S.length() / 2).equals(S.substring(0, S.length() / 2))) ans = "Yes";
        System.out.println(ans);
    }
}
