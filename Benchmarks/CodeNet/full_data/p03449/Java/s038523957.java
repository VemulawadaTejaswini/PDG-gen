import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;


public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][]A=new int[2][N];
        for(int i=0;i<2;i++){
            for(int j=0;j<N;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int[]C=new int[N];
        C[0]=A[0][0];
        for(int i=1;i<N;i++){
            C[i]=C[i-1]+A[0][i];
        }
        int[]D=new int[N];
        D[0]=A[1][0];
        for(int i=1;i<N;i++){
            D[i]=D[i-1]+A[1][i];
        }
        int max=0;
        int sum=0;
        for(int i=0;i<N;i++){
            if(i==0){
                sum=C[i]+D[N-1];
                max=sum;
            }else{
                sum=C[i]+D[N-1]-D[i-1];
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);

}
        
        
    }
