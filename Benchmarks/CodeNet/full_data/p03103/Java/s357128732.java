import java.util.*;
import java.util.Map.Entry;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] NM = line.split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        
        ArrayList<Long> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        //Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < N; i++) {
            line = scan.nextLine();
            String[] AB = line.split(" ");
            //map.put(Integer.parseInt(AB[0]), Integer.parseInt(AB[1]));
            A.add(Long.parseLong(AB[0]));
            B.add(Integer.parseInt(AB[1]));
        }
        //List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        long out = 0;
        int m_keep = M;
        int count = 0;
        
        while (m_keep > 0) {
            long min = Integer.MAX_VALUE;
            int i_min = -1;
            for (int i = 0; i < N-count; i++) {
                if (A.get(i) < min) {
                    min = A.get(i);
                    i_min = i;
                }
            }
            int kosuu = (B.get(i_min) <= m_keep) ? B.get(i_min) : m_keep;
            out += A.get(i_min) * kosuu;
            m_keep -= kosuu;
            // if (B.get(i_min) <= m_keep) {
            //     out += A.get(i_min) * B.get(i_min);
            //     m_keep -= B.get(i_min);
            // }
            // else {
            //     out += A.get(i_min) * m_keep;
            //     m_keep = 0;
            // }
            A.remove(i_min);
            B.remove(i_min);
            count++;
        }
        
        System.out.println(out);
    }
}
