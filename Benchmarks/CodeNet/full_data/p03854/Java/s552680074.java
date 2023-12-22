import java.util.*;
public class Main {
    private static String S;
    private static HashMap<Character, ArrayList<String>> map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        map = new HashMap<>();
        ArrayList<String> listD = new ArrayList<>();
        listD.add("dream");
        listD.add("dreamer");
        ArrayList<String> listE = new ArrayList<>();
        listE.add("erase");
        listE.add("eraser");
        map.put('d', listD);
        map.put('e', listE);
        while(S.length() >= 5) {
            String tail5 = S.substring(S.length() - 5, S.length());
            if(tail5.equals("dream") || tail5.equals("erase")) {
                S = S.substring(0, S.length() - 5);
                continue;
            }
            if(S.length() >= 6) {
                String tail6 = S.substring(S.length() - 6, S.length());
                if(tail6.equals("eraser")) {
                    S = S.substring(0, S.length() - 6);
                    continue;
                }
            }
            if(S.length() >= 7) {
                String tail6 = S.substring(S.length() - 7, S.length());
                if(tail6.equals("dreamer")) {
                    S = S.substring(0, S.length() - 7);
                    continue;
                }
            }
            break;
        }
        if(S.length() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


