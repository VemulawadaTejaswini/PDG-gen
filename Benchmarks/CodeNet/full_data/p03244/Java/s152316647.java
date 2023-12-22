import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] va=new int[n/2];
        int[] vb=new int[n/2];
        int t=0;
        int j=0;
        for(int i=0;i<n/2;i++){
            va[i]=sc.nextInt();
            vb[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            if(va[0]!=va[i]){
                t=1;
                System.out.println(va[0]);
            }
            if(vb[0]!=vb[i]){
                t=1;
                System.out.println(vb[0]);
            }
            if(va[i]==vb[i]){
                t=1;
                j=1;
            }
            
        }
        
        if(t==0) System.out.println(0);
        if(t==1&&j==1) System.out.println(n/2);
            
        
        
        
        
     }
}