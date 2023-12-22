import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int k = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<t; i++){
            q.add(Integer.parseInt(sc.next()));
        }
        
        while(q.size()>1){
            int x = q.poll();
            int y = q.poll();
            q.add(x-y);
        }
        
        System.out.println(q.poll()-1);
    }
}
