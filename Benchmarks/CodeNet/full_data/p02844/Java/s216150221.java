import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Set<String> result = new HashSet<>();
        search(s, "", new HashSet<>(), result);

        System.out.println(result.stream().count());
    }

    private static void search(String s, String tmp, Set<String> memo, Set<String> result) {
        if(tmp.length() == 3) {
            result.add(tmp);
            return;
        }
        else if(s.isEmpty()) {
            return;
        }
        else if(memo.contains(s + "&" + tmp)) {
            return;
        }

        for(int i = 0;i < s.length();i++) {
            String addedS = s.substring(i, i + 1);
            search(s.substring(i + 1), tmp + addedS, memo, result);
        }

        memo.add(s + "&" + tmp);
        return;
    }

}
