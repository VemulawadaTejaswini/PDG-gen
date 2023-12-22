import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> strs = new HashMap<>();
        for(int i=0;i<n;i++){
            String tmp = sc.next();
            if(strs.containsKey(tmp)){
                strs.put(tmp, strs.get(tmp)+1);
            }
            else{
                strs.put(tmp, 1);
            }
        }
        TreeMap<String, Integer> treeMap =new TreeMap<String, Integer>(new IntegerMapComparator(strs));
        treeMap.putAll(strs);
        Set<String> res = treeMap.keySet();
        Iterator<String> itr = res.iterator();
        String first = itr.next();
        System.out.println(first);
        Integer max = treeMap.get(first);
        while(itr.hasNext()){
            String tmp = itr.next();
            if(treeMap.get(tmp)<max){
                break;
            }
            System.out.println(tmp);

        }
    }
}

class IntegerMapComparator implements Comparator<String> {
    private Map<String, Integer> map;
    public IntegerMapComparator(Map<String, Integer>  map) {
        this.map = map;
    }
    /** key 2つが与えられたときに、その value で比較 */
    public int compare(String key1, String key2) {
        // value を取得
        int value1 = map.get(key1);
        int value2 = map.get(key2);
        // value の降順, valueが等しいときは key の辞書順
        if(value1 == value2)
            return key1.toLowerCase().compareTo(key2.toLowerCase());
        else if(value1 < value2)
            return 1;
        else
            return -1;
    }
}
