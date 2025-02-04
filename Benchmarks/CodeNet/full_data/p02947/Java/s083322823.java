import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        String[] str  = new String[N];
        List<String> list = new ArrayList<String>();
        Arrays.setAll(str, i ->  scanner.next());

        char ar[][] = new char[N][];
        for(int i =0; i < N; i++) {
            ar[i] = str[i].toCharArray();
            Arrays.sort(ar[i]);
            list.add(String.valueOf(ar[i]));
        }

        Map<String, Long> map = new HashMap<String, Long>();
        Long count = 0L;
        for (String temp : list) {
            if (map.containsKey(temp)) {
                count += map.get(temp);
                map.put(temp, map.get(temp) + 1L);
            } else {
                map.put(temp, 1L);
            }
        }
        System.out.println(count);
    }
}
