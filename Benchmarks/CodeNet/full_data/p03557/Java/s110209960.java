
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.next());
        int[]A=new int[N];
        int[]B=new int[N];
        int[]C=new int[N];
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(sc.next());
            
        }
        for(int i=0;i<N;i++){
            B[i]=Integer.parseInt(sc.next());
        }
        for(int i=0;i<N;i++){
            C[i]=Integer.parseInt(sc.next());
        }
        int x=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                    for(int k=0;k<N;k++){
                        if((A[i]<B[j])&&(B[j]<C[k])){
                            x++;
                        }
                    
                }
            }
        }
        System.out.println(x);
        
        }
       
        
    }
        
     