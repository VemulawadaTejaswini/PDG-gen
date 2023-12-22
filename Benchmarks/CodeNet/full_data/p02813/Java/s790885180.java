import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String p = "", q = "";
        for (int i = 0; i < n; i++) {
            p += sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q += sc.nextInt();
        }
        List<String> list = new ArrayList<String>();
        list = permutation(p, "", list);
        Collections.sort(list);
        System.out.println(Math.abs((list.indexOf(p) + 1) - (list.indexOf(q) + 1)));
    }

    public static List<String> permutation(String q, String ans, List<String> list){
        if(q.length() <= 1) {
            list.add(ans + q);
        } else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i), list);
            }
        }
        return list;
    }
}