import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        int[] v = new int[n];
        for(int i=0; i<n; i++){
            v[i] = Integer.parseInt(sc.next());
        }
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int max = 0;
        
        for(int a=0; a<=Math.min(k,n); a++){
            for(int b=0; b<=Math.min(k-a,n-a); b++){
                q.clear();
                q.add(0);
                int sum = 0;
                for(int i=0; i<a; i++){
                    q.add(v[i]);
                    sum += v[i];
                }
                for(int i=0; i<b; i++){
                    q.add(v[n-1-i]);
                    sum += v[n-1-i];
                }
                
                for(int i=0; i<k-(a+b); i++){
                    if(q.peek()==0){
                        break;
                    }
                    sum -= q.poll();
                }
                max = Math.max(max, sum);
            }
        }
        
        System.out.println(max);
    }
}
