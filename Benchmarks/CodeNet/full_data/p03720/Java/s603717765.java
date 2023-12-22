import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<M*2; i++){
            int a = Integer.parseInt(sc.next());
            if(map.get(a) == null){
                map.put(a, 1);
            }else{
                map.put(a, map.get(a) + 1);
            }
        }
        
        for(int i=1; i<=N; i++){
            System.out.println(map.get(i));
        }
    }
}