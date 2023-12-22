import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> strs = new HashMap<>();
        Queue<String> queue = new PriorityQueue<>(n);
        Integer max = 1;
        for(int i=0;i<n;i++){
            String tmp = sc.next();
            if(strs.containsKey(tmp)){
                Integer p = strs.get(tmp)+1;
                max = max < p ? p : max;
                strs.put(tmp, p);
            }
            else{
                queue.add(tmp);
                strs.put(tmp, 1);
            }
        }
        System.out.println(queue);

        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()){
            String tmp = itr.next();
            if(strs.get(tmp)==max){
                System.out.println(tmp);
            }
        }
    }
}
