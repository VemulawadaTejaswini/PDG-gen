import java.util.*;

public class Main {
    private static Integer N;
    private static Map<Integer, Map<Integer, List<Integer>>> mp = new HashMap<>();

    public static boolean judge(Integer bit) {
        for(int i = 0; i < N; ++i) {
            // i人目が「不親切」だったら、証言は無意味
            if((bit & (1 << i)) == 0) continue;

            for(List<Integer> xy: mp.get(i).values()) {
                // それぞれ確認
                for(int j = 0; j < xy.size(); j++) {
                    Integer x = xy.get(0);
                    Integer y = xy.get(1);

                    //System.out.println(bit & (1 << x));
                    if( y == 1 && ((bit & (1 << x)) == 0)) return false;
                    if( y == 0 && ((bit & (1 << x)) != 0)) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        mp = new HashMap<>();
        N = Integer.parseInt(scanner.next());

        // ここで初期化
        for(int i = 0; i < N; i++) {
            Integer A = Integer.parseInt(scanner.next());
            Map<Integer, List<Integer>> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();

            for(int j = 0;  j < A; ++j) {
                list.add(Integer.parseInt(scanner.next()) - 1);
                list.add(Integer.parseInt(scanner.next()));
                map.put(j,list);
                mp.put(i, map);
            }
        }

        Integer res = 0;
        for(int bit = 0; bit < (1 << N); ++bit) {
            if(judge(bit)) {
                int count = 0;
                for(int i = 0; i < N; ++i) {
                    if((bit & (1 << i)) != 0) ++count;
                }
                res = Math.max(res,count);
            }
        }

        System.out.println(res);
    }
}
