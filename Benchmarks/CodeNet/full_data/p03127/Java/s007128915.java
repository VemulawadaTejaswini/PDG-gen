import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String[] nabc = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        String[] m = br.readLine().split(" ");
        //int[] mon = new int[n];
        
        List<Integer> mon = new ArrayList();
        for (int i = 0; i < n; i++) {
            mon.add(Integer.parseInt(m[i]));
            //mon[i] = Integer.parseInt(m[i]);
        }
        
        while (true) {
            if (mon.size() == 1) break;
            Collections.sort(mon);
            //int m = mon[0];
            int mo = mon.get(0);
            for (int i = 1; i < mon.size(); i++) {
                int newv = mon.get(i)%mo;
                mon.remove(i);
                mon.add(i, newv);
            }
            
            for (int i = 0; i < mon.size(); i++) {
                if (mon.get(i) == 0) {
                    mon.remove(i);
                    i--;
                }
            }
        }
        
        
        System.out.println(mon.get(0));
    }
}



