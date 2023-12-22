import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> q = new PriorityQueue<Integer>(new MyComparator());
        for(int i = 0; i < n; i++){
            q.add(sc.nextInt());
        }
        for(int i = 0; i < m; i++){
            int a = q.poll();
            q.add(a/2);
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += q.poll();
        }
        System.out.println(ans);
    }
}

class MyComparator implements Comparator<Integer>{
 
    public int compare(Integer n1, Integer n2) {
        if(n1 < n2) {
            return 1;
        } else if(n1 > n2) {
            return -1;
        } else{
            return 0;
        }
    }
}
