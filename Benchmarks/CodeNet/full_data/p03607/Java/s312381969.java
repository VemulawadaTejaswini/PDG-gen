import java.util.*;
 
 
class Main {
    static int abc[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<A.length; i++){
            A[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0; i<A.length; i++){
            map.put(A[i],0);
        }
        for(int i=0; i<A.length; i++){
            int n = map.get(A[i]) + 1;
            map.put(A[i],n);
        }
        int ans = 0;
        for(int i=0; i<N; i++){
            int m = map.get(A[i])%2;
            if(m == 1){
                ans++;
                map.put(A[i],0);
            }
        }
        System.out.println(ans);
    }

}