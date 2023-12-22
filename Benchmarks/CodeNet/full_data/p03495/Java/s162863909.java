import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] a = new int[n];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            
            map.put(a[i], map.containsKey(a[i]) ? map.get(a[i]) + 1 : 1);
        }
        
        List<Integer> values = new ArrayList<Integer>();
        
        for(Map.Entry<Integer,Integer> ent : map.entrySet()) values.add(ent.getValue());
        
        Collections.sort(values);
        
        if(values.size() <= k){
            System.out.println(0);
        }else{
            int res = 0;
            for(int i = 0; i < values.size() - (values.size() - k) - 1; i++){
                res+=values.get(i);
            }
            
            System.out.println(res);
        }
    }
}
