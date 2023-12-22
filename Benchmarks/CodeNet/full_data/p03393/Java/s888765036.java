import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean[] used = new boolean[26];
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.charAt(i) - 'a' + 1; j < 26; j++) {
                if(!used[j]){
                    if(i != 0) ans = s.substring(0, i) + (char)(j + 'a');
                    else ans = String.valueOf((char)(j + 'a'));
                    break;
                }
            }
            used[s.charAt(i) - 'a'] = true;
        }
        for (int j = 0; j < 26; j++) {
            if(!used[j]){
                ans = s + String.valueOf((char)(j + 'a'));
                break;
            }
        }

        if(ans.equals("")) System.out.println(-1);
        else System.out.println(ans);
        sc.close();
    }

}
