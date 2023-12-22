import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        TreeMap<String, Integer> map = new TreeMap<>();


        for (int i=0; i<n; i++){
            String s = sc.next();
            if (map.containsKey(s)){
                int tmp = (int)map.get(s);
                map.put(s, tmp+1);
            }else {
                map.put(s, 1);
            }
        }


        List<String> list = new ArrayList<>();


        String maxStr = ((TreeMap<String, Integer>)sortByValues( map)).firstKey();
        int max = map.get(maxStr);

        for (String key: map.keySet()){
            if (map.get(key)==max){
                list.add(key);
            }else {
                return;
            }
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<list.size(); i++){
            sb.append(list.get(i)+"\n");
        }
        System.out.print(sb.toString());
//        System.out.print(sortByValues(map));
    }

    public static <K, V extends Comparable<V>> Map<K, V>
    sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator =
                new Comparator<K>() {
                    public int compare(K k1, K k2) {
                        int compare =
                                map.get(k2).compareTo(map.get(k1));
                        if (compare == 0)
                            return 1;
                        else
                            return compare;
                    }
                };

        Map<K, V> sortedByValues =
                new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }
}
