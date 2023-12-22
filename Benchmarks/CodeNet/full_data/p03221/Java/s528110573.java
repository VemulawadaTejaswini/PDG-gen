import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] parr = new int[m];
        int[] yarr = new int[m];
        for(int i = 0; i < m;i++){
            int p = sc.nextInt();
            parr[i] = p;
            int y = sc.nextInt();
            yarr[i] = y;

            if(map.containsKey(p)){
                map.get(p).add(y);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(y);
                map.put(p, list);
            }
        }

        for(int key : map.keySet()){
            Collections.sort(map.get(key));
        }

        for(int i = 0; i < m;i++){
            int index = map.get(parr[i]).indexOf(yarr[i]) + 1;
            System.out.printf("%05d%05d\n", parr[i], index);
        }
    }

}