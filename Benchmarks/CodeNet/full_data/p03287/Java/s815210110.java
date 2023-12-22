import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();
        int[] S =new int[N+1];
        int[] A = new int[N+1];
        long count=0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=1;i<N+1;i++){
            A[i]=stdIn.nextInt()%M;
        }
        for(int i=1;i<N+1;i++){
                S[i]=(A[i]+S[i-1])%M;
        }
        for(int i=0;i<N+1;i++){
           if(map.get(S[i])!= null)map.put(S[i],map.get(S[i])+1);
           else map.put(S[i],1);
           count +=map.get(S[i])-1;
        }
        System.out.println(count);
        
    }
}
