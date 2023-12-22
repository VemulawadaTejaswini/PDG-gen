import java.util.*;

public class Main{
    public static void main(String argv[]){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        LinkedList<Long> ll = new LinkedList<>();
        for(int i = 0; i < n; i++){
            ll.add(Long.parseLong(scan.next()));
        }
        ll.sort(Comparator.naturalOrder());
        
        for(int i = 0; i < m; i++){
            int b = Integer.parseInt(scan.next());
            long c = Long.parseLong(scan.next());
            for(int j = 0; j < b; j++){
                if(ll.get(j) > c) break;
                ll.set(j, c);
            }
            ll.sort(Comparator.naturalOrder());
        }
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += ll.get(i);
        }
        System.out.println(sum);
    }
}
