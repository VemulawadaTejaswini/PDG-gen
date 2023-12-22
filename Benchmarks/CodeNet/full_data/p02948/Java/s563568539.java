import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        Integer N = scan.nextInt();
        Integer M = scan.nextInt();
        long totalEarn = 0;
        Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        for(int i = 0; i < N; i++){
            Integer A = scan.nextInt();
            Integer B = scan.nextInt();
            if(map.containsKey(A)){
                List<Integer> list = map.get(A);
                list.add(B);
                Collections.sort(list, Comparator.reverseOrder());
            } else {    
                List<Integer> list = new ArrayList<Integer>();
                list.add(B);
                map.put(A, list);
            }
        }
        for(int i = 1; i < M + 1; i++){
           Map<Integer, Integer> candidateMap = new TreeMap<Integer, Integer>(Comparator.reverseOrder());
            for(Entry<Integer, List<Integer>> entry : map.entrySet()){
                if(i < entry.getKey() || entry.getValue().isEmpty())
                    continue;
                
                int salary = entry.getValue().get(0);
                if(candidateMap.containsKey(salary)) {
                    if(entry.getKey() < candidateMap.get(salary))
                    candidateMap.put(salary, entry.getKey());
                } else {
                    candidateMap.put(salary, entry.getKey());
                }
            }   
            if(candidateMap.isEmpty())
                continue;
                
            Map.Entry<Integer, Integer> firstEntry = candidateMap.entrySet().iterator().next();
            totalEarn += firstEntry.getKey();
            List<Integer> list = map.get(firstEntry.getValue());
            list.remove(0);

            // for(Entry<Integer, Integer> entry : candidateMap.entrySet()){
            //     System.out.println(entry.getKey() + " " + entry.getValue());
            // } 
        }
        // for(Entry<Integer, List<Integer>> entry : map.entrySet()){
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // } 
        System.out.println(totalEarn);
       
    }
}
