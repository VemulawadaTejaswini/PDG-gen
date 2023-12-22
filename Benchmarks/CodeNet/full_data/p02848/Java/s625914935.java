import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        String list = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<Character> lists = new ArrayList<>();
        for (int i = 0; i < list.length(); i++)
            lists.add(list.charAt(i));
        List<Character> ans = new ArrayList<>();
        for (int i = 0; i < str.length(); i++)
            ans.add(str.charAt(i));
        for (int i = 0; i < ans.size(); i++)
            ans.set(i, (lists.get(lists.indexOf(ans.get(i)) + n)));
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i));
    }
}
