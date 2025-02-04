import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) A[i]=sc.nextInt();
        HashMap<Integer,Integer> val_idx = new HashMap<>();
        for(int i=0;i<N;i++) val_idx.put(A[i],i);
        int[] B = new int[N];
        System.arraycopy(A,0,B,0,N);
        Arrays.sort(B);
        int ans = 0;
        for(int i=0;i<N;i++){
            if(val_idx.get(B[i])==i) continue;
            int cur_idx = val_idx.get(B[i]);
            if((cur_idx-i)%2==1) ans += 1;
        }
        System.out.println(ans/2);
    }
}