import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int A=sc.nextInt();
        int B=sc.nextInt();
        int K=sc.nextInt();
        
        
        
        if(B-(A+1)>K){
            for(int i=A;i<A+K;i++){
                System.out.println(i);
            }
            for(int i=B-K+1;i<=B;i++){
                System.out.println(i);
            }
        }else{
            for(int i=A;i<=B;i++){
                System.out.println(i);
            }
        }
        
        
        
        
        
        
        
        
    }
}
