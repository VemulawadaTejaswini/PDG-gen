import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] sArr = sc.next().toCharArray();
        boolean[] abc = new boolean[26];

        for (int i = 0; i < sArr.length; i++) {
            abc[sArr[i]-'a'] = true;
        }

        String ans = "None";
        for (int i = 0; i < abc.length; i++) {
            if (abc[i] == true) {
                continue;
            } else {
                char ansChar = (char)(i+'a');
                ans = String.valueOf(ansChar);
                break;
            }
        }

        System.out.println(ans);
    }
}
