import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> m = new HashMap();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (m.get(s) != null) m.replace(s, m.get(s) + 1);
            else m.put(s, 1);
        }
        int max = 0;
        for (Integer val : m.values()) max = Math.max(max, val);
        ArrayList<String> al = new ArrayList();
        for (Map.Entry<String, Integer> e : m.entrySet()) {
            if (e.getValue() == max) al.add(e.getKey()); 
        }
        Collections.sort(al);
        for (String s : al) System.out.println(s);
    }
}