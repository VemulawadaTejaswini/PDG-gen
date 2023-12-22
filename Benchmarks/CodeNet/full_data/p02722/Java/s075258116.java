import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();  
        long M=0;
        M=N;
        long count=0;
        for(long i=2;i<=M;i++){
            
            while(N>=1){
                 
                if(N%i==0){
                    N=N/i;
                    //System.out.println(N);
                    if(N==1)count+=1;
                
                }else{
                    N=N-i;
                    //System.out.println(N);
                    if(N==1)count+=1;
                }
                //System.out.println(M);
                //System.out.println(i);
            }
            N=M;
        }    
        System.out.println(count);
    }
}