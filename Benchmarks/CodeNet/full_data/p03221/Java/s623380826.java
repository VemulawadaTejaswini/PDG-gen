import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] pArray = new int[m];
        int[] yArray = new int[m];
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < m; i++){
            int p = sc.nextInt();
            int y = sc.nextInt();
            pArray[i] = p;
            yArray[i] = y;
            if(map.containsKey(p)){
                map.get(p).add(y);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(y);
                map.put(p, list);
            }
        }
        
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            Collections.sort(entry.getValue());
        }
        
        for(int i = 0; i < m; i++){
            String pZero = "";
            String yZero = "";
            for(int j = 0; j < 6 - (String.valueOf(pArray[i]).length()); j++){
                pZero = pZero.concat("0");
            }
            for(int j = 0; j < 6 - (String.valueOf(map.get(pArray[i]).indexOf(yArray[i]) + 1)).length(); j++){
                yZero = yZero.concat("0");
            }
            System.out.println(pZero + pArray[i] + yZero + (map.get(pArray[i]).indexOf(yArray[i]) + 1));
        }
    }
}
