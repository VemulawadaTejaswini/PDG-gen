import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v;
        

        Map<Integer, Integer> map_gu = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map_ki = new HashMap<Integer, Integer>();

        int countResult = 0;

        for(int i = 1; i<=n; i++){
            int key = sc.nextInt();
            if(i%2 == 0) {
                if (map_gu.containsKey(key)) {
                    v = map_gu.get(key) + 1;
                } else {
                    v = 1;
                }
                map_gu.put(key, v);
            } else{
                if (map_ki.containsKey(key)) {
                    v = map_ki.get(key) + 1;
                } else {
                    v = 1;
                }
                map_ki.put(key, v);
            }
        }

        map_gu.entrySet().stream()
                .sorted(java.util.Collections.reverseOrder(java.util.Map.Entry.comparingByValue()));

        map_ki.entrySet().stream()
                .sorted(java.util.Collections.reverseOrder(java.util.Map.Entry.comparingByValue()));

        int kizikuGu = 0;
        int kizikuKi = 0;

        int secondValueGu = 0;
        int secondValueKi = 0;

        for(Iterator<Integer> iterator = map_gu.keySet().iterator(); iterator.hasNext(); ) {
            kizikuGu = iterator.next();
            if(iterator.hasNext()) {
                secondValueGu = iterator.next();
            }
            break;
        }

        for(Iterator<Integer> iterator = map_ki.keySet().iterator(); iterator.hasNext(); ) {

            kizikuKi = iterator.next();
            if(iterator.hasNext()) {
                secondValueKi = iterator.next();
            }
            break;
        }

        if(kizikuGu == kizikuKi) {
            if(map_gu.get(kizikuGu) > map_ki.get(kizikuKi)){
                kizikuKi = secondValueKi;

            }
            if(map_gu.get(kizikuGu) < map_ki.get(kizikuKi)){
                kizikuGu =secondValueGu;

            }
            if(map_gu.get(kizikuGu) == map_ki.get(kizikuKi)){
                countResult = map_gu.get(kizikuGu);
            }
        }




        for(Map.Entry<Integer, Integer> entry : map_gu.entrySet()) {
            if(entry.getKey() == kizikuGu){
                continue;
            }
            countResult += entry.getValue();
        }


        for(Map.Entry<Integer, Integer> entry : map_ki.entrySet()) {
            if(entry.getKey() == kizikuKi){
                continue;
            }
            countResult += entry.getValue();
        }


        System.out.print(countResult);


    }
}
