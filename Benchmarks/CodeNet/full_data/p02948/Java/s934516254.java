import java.util.*;
import java.util.HashMap;
import java.util.PriorityQueue;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[N + 1];
        int[] A = new int[N];
        int[] B = new int[N];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            if(map.get(A[i])==null){
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(B[i]);
                map.put(A[i], list);
            }
            else{
                ArrayList<Integer> list = map.get(A[i]);
                list.add(B[i]);
                map.put(A[i], list);
            }
        }
        long ans = 0;
        for(int i=1; i<=M; i++){
            if(map.get(i)!=null){
                ArrayList<Integer> list = map.get(i);
                que.addAll(list);
            }
            if(!que.isEmpty()){
                ans += que.poll();
            }
        }
        System.out.println(ans);
    }
}