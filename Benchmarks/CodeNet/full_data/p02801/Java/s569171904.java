import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int K= sc.nextInt();
        int M= sc.nextInt();
        int [] A=new int[N-1];
        int sum=0;
        for(int y=0;y<A.length; y++ ){
           A[y]=sc.nextInt();
           sum+= A[y];
    }
        
        int base = M*N;
        System.out.println(base);
        if(base-sum>K){
            System.out.println(-1);
            
        }else if(base-sum<=0){
            System.out.println(0);
        }
    }
}
