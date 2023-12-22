import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Map<Integer,Integer>> list = new ArrayList<Map<Integer,Integer>>();
        for(int i = 0; i < n; i++){
            Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
            int a = sc.nextInt();
            for(int j = 0; j < a; j++){
                int key = sc.nextInt()-1;
                int val = sc.nextInt();
                tmp.put(key,val);
            }
            list.add(tmp);
        }
        // 正直者 1,  嘘つき 0
        int ans = 0;
        for(int i = 0; i < Math.pow(2,n); i++){
            boolean bool = true;
            for(int j = 0; j < n; j++){
                Map<Integer, Integer> tmp = list.get(j);
                for (Iterator<Map.Entry<Integer, Integer>> iterator = tmp.entrySet().iterator(); iterator.hasNext();) {
            		Map.Entry<Integer, Integer> entry = iterator.next();
            		int key = entry.getKey();
            		int val = entry.getValue();
            		if((i >> j) % 2 == 0){
            		    val = 1 - val;
            		}
            		if((i >> key) % 2 != val){
            		    bool = false;
            		    break;
            		}
            	}
            }
            if(bool){
            	ans = Math.max(ans,Integer.bitCount(i));
            }
        }
        System.out.println(ans);
    }
}

