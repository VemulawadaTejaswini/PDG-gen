import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        Integer ans=0;
        Integer[] A= new Integer[N];
        
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        Arrays.sort(A, Collections.reverseOrder());
        
        for(int i=0;i<N;i++){
            if(i%2==0){
                ans+=A[i];
            }else{
                ans-=A[i];
            }
        }
        
        System.out.println(ans);
    }
}
