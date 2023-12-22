import java.util.Map.Entry;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> strs = new ArrayList<>();
        while (sc.hasNext()) {
            strs.add(sc.nextLine());
            }
        Map<String, Integer> m = new HashMap<>();
        for (String s : strs) {
            int v;
            if (m.containsKey(s)) {
                v = m.get(s) + 1;
            } else {
                v = 1;
            }
            m.put(s, v);
        }
    Map.Entry<String, Integer> maxEntry = null;
    List<String> keys = new ArrayList<>();
    //String maxkey = null;
    int maxvalue = 0;
    for (Entry<String, Integer> entry : m.entrySet()) {
        if (maxEntry == null || (entry.getValue()) >= maxvalue) {
            maxEntry = entry;
            keys.add(maxEntry.getKey());
            maxvalue = maxEntry.getValue();
            }
        }
    for(String s:keys){
            System.out.println(s);
    }
    }
}