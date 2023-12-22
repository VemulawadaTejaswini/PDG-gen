import java.util.*;

public class Main {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int str = sc.nextInt();
        
        List<Integer> all = new ArrayList<Integer>();
        List<Integer> db = new ArrayList<Integer>();
        for (int i = 0; i < str; i++) {
            int lg = sc.nextInt();
            if (all.contains(lg)) {
                all.remove((Integer)lg);
                db.add(lg);
            } else {
                all.add((lg));
            }
        }
        
        if (db.size() < 2) {
            System.out.println(0);
        } else {
            Collections.sort(db);
            Collections.reverse(db);
            System.out.println(db.get(0) * db.get(1));
        }
    }
}