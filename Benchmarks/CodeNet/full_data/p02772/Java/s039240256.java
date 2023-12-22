import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = scn.nextInt();
        }
        
        Boolean ok = true;
        for(int x:A){
            if(x%2==0){
                if(x%3!=0&&x%5!=0) ok = false; 
            }
        }
        
        System.out.println(ok?"APPROVED":"DENIED");
    }
}
