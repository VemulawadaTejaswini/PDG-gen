
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if(s.length() != t.length()){
            System.out.println("No");
            return;
        }

        List<Character> slist = new ArrayList<>();
        List<Character> tlist = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            slist.add(s.charAt(i));
            tlist.add(t.charAt(i));
        }

        Collections.sort(slist);
        Collections.sort(tlist);

        for (int i = 0; i < s.length(); i++) {
            if(! Objects.equals(slist.get(i), tlist.get(i))){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
