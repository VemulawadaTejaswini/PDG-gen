import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        String W = sc.next();
        
        int l = W.length();
        Map<String,Integer> map = new HashMap<>();
        String result = "Yes";
        if(l%2 != 1){
            for(int i=0;i<l;i++){
                String x = W.substring(i,i+1);
                if(map.get(x) == null){
                    map.put(x,1);
                }else{
                    map.put(x,map.get(x)+1);
                }
            }
            
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                if(entry.getValue() % 2 == 1){
                    result = "No";
                    break;
                }
            }
        }else{
            result = "No";
        }
        System.out.println(result);
        
    }
}
