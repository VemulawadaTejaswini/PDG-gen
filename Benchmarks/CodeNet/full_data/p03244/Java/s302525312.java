import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Map<Integer,Integer> odd = new TreeMap<>();
        Map<Integer,Integer> even = new TreeMap<>();
        int n = s.nextInt();
        for(int i = 0; i < n; i++) {
            int v = s.nextInt();
            if((i & 1) == 1) {
                if(!odd.containsKey(v)) {
                    odd.put(v,0);
                }
                odd.put(v,odd.get(v) + 1);
            } else {
                if(!even.containsKey(v)) {
                    even.put(v,0);
                }
                even.put(v,even.get(v) + 1);
            }
        }
        odd = sortByValues(odd);
        even = sortByValues(even);
        System.out.println(getAns(odd,even,n));
    }
    private static int getAns(Map<Integer,Integer> odd, Map<Integer,Integer> even,int n) {
        int ans;
        if(odd.size() == 1 && even.size() == 1 ) {
            if(odd.entrySet().iterator().next().getKey().equals(even.entrySet().iterator().next().getKey())) {
                ans = n/2;
            } else {
                ans = 0;
            }
        } else if(odd.size() == 1 || even.size() == 1) {
            Iterator<Map.Entry<Integer, Integer>> oddIterator = odd.entrySet().iterator();
            Iterator<Map.Entry<Integer, Integer>> evenIterator = even.entrySet().iterator();
            Map.Entry<Integer,Integer> of = oddIterator.next();
            Map.Entry<Integer,Integer> ef = evenIterator.next();
            if(of.getKey().equals(ef.getKey())) {
                if(odd.size() == 1) {
                    ans = (n/2) - evenIterator.next().getValue();
                } else {
                    ans = (n/2) - oddIterator.next().getValue();
                }
            } else {
                if(odd.size() == 1) {
                    ans = (n/2) - ef.getValue();
                } else {
                    ans = (n/2) - of.getValue();
                }
            }
        } else {
            Iterator<Map.Entry<Integer, Integer>> oi = odd.entrySet().iterator();
            Iterator<Map.Entry<Integer, Integer>> ei = even.entrySet().iterator();
            Map.Entry<Integer,Integer> oF = oi.next();
            Map.Entry<Integer,Integer> eF = ei.next();
            if(!oF.getKey().equals(eF.getKey())) {
                ans = (n/2) - oF.getValue();
                ans += (n/2) - eF.getValue();
            } else {
                Map.Entry<Integer,Integer> oS = oi.next();
                Map.Entry<Integer,Integer> eS = ei.next();
                int r1,r2;
                r1 = (n/2) - oF.getValue();
                r1 += (n/2) - eS.getValue();

                r2 = (n/2) - eF.getValue();
                r2 += (n/2) - oS.getValue();
                ans = r1 > r2 ? r2 : r1;
            }
        }
        return ans;
    }
    private static Map<Integer,Integer> sortByValues(Map<Integer,Integer> map) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int compare = map.get(o2).compareTo(map.get(o1));
                return compare == 0 ? 1 : compare;
            }
        };
        Map<Integer,Integer> sortedMap = new TreeMap(comparator);
        sortedMap.putAll(map);
        return sortedMap;
    }
}