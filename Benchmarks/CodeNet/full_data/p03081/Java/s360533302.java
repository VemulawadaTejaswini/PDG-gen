import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        String s = sc.next();

        int[] m = new int[N + 2];

        Map<Character, List<Integer>> map = new HashMap<>();

        for(int i=1; i<=N; i++) {
            m[i] = 1;
        }

        for(int i=0; i<N; i++) {
            int index = i + 1;

            List<Integer> list = map.getOrDefault(s.charAt(i), new ArrayList<>());
            list.add(index);
            map.put(s.charAt(i), list);
        }

        for(int i=0; i<Q; i++) {
            String t = sc.next();
            String d = sc.next();

            if (!map.containsKey(t.charAt(0))){
                continue;
            }
            List<Integer> list = map.get(t.charAt(0));
            for(int j=0; j<list.size(); j++) {
                int index = list.get(j);
                switch(d) {
                   case "L":
                       m[index-1]+= m[index];
                       break;
                   case "R":
                       m[index+1]+= m[index];
                       break;
                }
                m[index] = 0;
            }
        }

        int ans = 0;
        for(int i=1; i<=N; i++) {
            ans += m[i];
        }

        System.out.println(ans);
   }
}