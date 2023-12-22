import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "None";

        for(int i = 0; i < 26; i++) {
            char tmp='a';
            String strTmp = String.valueOf(tmp);
            if (!s.contains(strTmp)) {
            	ans=strTmp;
            }
            tmp++;
        }
        System.out.println(ans);
    }
}