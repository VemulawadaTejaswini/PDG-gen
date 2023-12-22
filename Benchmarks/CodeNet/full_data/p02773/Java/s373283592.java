import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class Main {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String str = scanner.next();
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
            }else{
                map.put(str, 1);
            }
        }
        scanner.close();
        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2){
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });
        List<String> resultList = new ArrayList<>();
        // resultList.add(list.get(list.size()-1).getKey());
        for(int i=list.size()-1; i>=0; i--){
            if(list.get(i).getValue()==list.get(list.size()-1).getValue()){
                resultList.add(list.get(i).getKey());
            }
        }
        Collections.sort(resultList);
        for (String string : resultList) {
            System.out.println(string);
        }
    }

    
}