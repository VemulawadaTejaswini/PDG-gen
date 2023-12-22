import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.next();
        Map<String,Integer> strMap = new HashMap<>();
        int max = 0;
        while(sc.hasNext()){
            String str = sc.next();
            if(strMap.containsKey(str)){
                strMap.put(str,strMap.get(str)+1);
            }else{
                strMap.put(str,1);
            }
            max = Math.max(strMap.get(str),max);
        }
        List<String> strList = new ArrayList<>();
        for(String key : strMap.keySet()){
            if(strMap.get(key) == max)strList.add(key);
        }
        strList.stream().sorted().forEach(System.out::println);
    }
}
