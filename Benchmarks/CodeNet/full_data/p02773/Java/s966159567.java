import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();


        for (int i=0; i<n; i++){
            String s = sc.next();
            if (map.containsKey(s)){
                int tmp = (int)map.get(s);
                map.put(s, tmp+1);
            }else {
                map.put(s, 1);
            }
        }

//        System.out.print(map);

        List<String> list = new ArrayList<>();


        map = sortByValues(map);

//        System.out.print(map);

//        String maxStr = sortByValues(map)
//        int max = map.get(maxStr);
////        System.out.print(max);

//        for (String key: sortMapByValue(map).keySet()){
//            if (map.get(key)==max){
//                list.add(key);
//            }else {
//                break;
//            }
//        }

        int max = 0;
        for (int v: map.values()){
            max = Math.max(max, v);
        }

//        System.out.print(max);

//        System.out.print(map.keySet());


//        System.out.print(map.getClass());

        Collection<String> tmpStr = map.keySet();
        Collection<Integer> tmpInt = map.values();

        List<String> listStr = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>();

        for (String str: map.keySet()){
            listStr.add(str);
        }

        for (Integer Int: map.values()){
            listInt.add(Int);
        }

//        System.out.print(listStr);
//        System.out.print(listInt);

        for (int i=0; i<listStr.size(); i++){
            if (listInt.get(i)==max){
                list.add(listStr.get(i));
            }else break;
        }
//        System.out.print(tmpInt.toArray());

//        for (String str: map.keySet()){
//            int tmp = map.get(str).intValue();
//            if (tmp==max) list.add(str);
//            else break;
//        }


        Collections.sort(list);
//        System.out.print(list);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<list.size(); i++){
            sb.append(list.get(i)+"\n");
        }
        System.out.print(sb.toString());
//        System.out.print(sortByValues(map));
    }

    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
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
