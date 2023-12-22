import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer,Integer> oddmap = new TreeMap<Integer,Integer>(Comparator.reverseOrder());
        TreeMap<Integer,Integer> evenmap = new TreeMap<Integer,Integer>(Comparator.reverseOrder());
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(i % 2 == 0){
                if(evenmap.containsKey(a)){
                    evenmap.put(a,evenmap.get(a)+1);
                }else{
                    evenmap.put(a,1);
                }
            }else{
                if(oddmap.containsKey(a)){
                    oddmap.put(a,oddmap.get(a)+1);
                }else{
                    oddmap.put(a,1);
                }
            }
        }
        if(oddmap.firstKey() != evenmap.firstKey()){
            System.out.println(n - oddmap.get(oddmap.firstKey()) - evenmap.get(evenmap.firstKey()));
        }else{
            int downOdd = oddmap.get(oddmap.firstKey());
            int downEven = evenmap.get(evenmap.firstKey());
            int i = 0;
            for(Map.Entry<Integer,Integer> e : oddmap.entrySet()){
                if(i == 1){
                    downOdd -= e.getValue();
                    break;
                }
                i++;
            }
            i = 0;
            for(Map.Entry<Integer,Integer> e : evenmap.entrySet()){
                if(i == 1){
                    downEven -= e.getValue();
                    break;
                }
                i++;
            }
            System.out.println(n - oddmap.get(oddmap.firstKey()) - evenmap.get(evenmap.firstKey()) + Math.min(downOdd, downEven));
        }
    }
}