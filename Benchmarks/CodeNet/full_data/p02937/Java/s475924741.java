import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] t = sc.next().toCharArray();
        char[] s = sc.next().toCharArray();
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < t.length; i++) {
            if(map.containsKey(t[i])) map.get(t[i]).add(i);
            else{
                map.put(t[i], new ArrayList<>());
                map.get(t[i]).add(i);
            }
        }
        HashMap<Character, int[]> tm = new HashMap<>();
        for(Entry<Character, ArrayList<Integer>> e : map.entrySet()){
            int[] tmp = new int[e.getValue().size()];
            for (int i = 0; i < e.getValue().size(); i++) {
                tmp[i] = e.getValue().get(i);
            }
            tm.put(e.getKey(), tmp);
        }
        long ans = 1L;
        boolean able = true;
        int pre = 0;
        int len = t.length;
        for (int i = 0; i < s.length; i++) {
            if(tm.get(s[i]) == null){
                able = false;
                break;
            }
            int[] tmp = tm.get(s[i]);
            int ins = Arrays.binarySearch(tmp, pre+1);
            if(ins < 0){
                ins = -(ins + 1);
                if(tmp.length-1 < ins){
                    ans += len - pre + tmp[0];
                    pre = tmp[0];
                }else{
                    ans += tmp[ins] - pre;
                    pre = tmp[ins];
                }
            }else{
                ans += tmp[ins] - pre;
                pre = tmp[ins];
            }
        }
        System.out.println(able ? ans : -1);
        sc.close();

    }

}
