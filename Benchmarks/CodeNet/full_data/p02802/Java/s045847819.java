import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> finished = new HashSet<>();

        int cnt = 0;
        for(int i = 0; i < m; i++) {
        	int p = sc.nextInt();
        	String res = sc.next();
        	if(finished.contains(p))
        		continue;
        	if(res.equals("AC"))
        		finished.add(p);
        	else
        		cnt++;
        }
        System.out.println(finished.size() + " " + cnt);
    }
}
