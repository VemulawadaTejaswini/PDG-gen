import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        char[] s = sc.next().toCharArray();
        List<Character> ans = new LinkedList<>();
        ans.add(s[0]);
        for(int i = 0;i<s.length - 1;i++){
            if(s[i] != s[i + 1]){
                ans.add(s[i + 1]);
            }
        }
        System.out.println(ans.size());
    }
}