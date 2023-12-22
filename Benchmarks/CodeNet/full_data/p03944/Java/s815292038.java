import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int W=sc.nextInt();
        int H=sc.nextInt();
        int N=sc.nextInt();
        int[]X=new int[N];
        int[]Y=new int[N];
        int[]A=new int[N];
        for(int i=0;i<N;i++){
            X[i]=sc.nextInt();
            Y[i]=sc.nextInt();
            A[i]=sc.nextInt();
        }
        int xmax=0;
        int xmin=W;
        int ymax=0;
        int ymin=H;
        for(int i=0;i<N;i++){
            if(A[i]==1){
                if(X[i]>=xmax){
                    xmax=X[i];
                }
            }
            if(A[i]==2){
                if(X[i]<=xmin){
                    xmin=X[i];
                }
            }
            if(A[i]==3){
                if(Y[i]>=ymax){
                    ymax=Y[i];
                }
            }
            if(A[i]==4){
                if(Y[i]<=ymin){
                    ymin=Y[i];
                }
            }
        }
        int menseki=(xmin-xmax)*(ymin-ymax);
        System.out.println(menseki);


    

       

        
        
        }
       
        
    }
        
     
    