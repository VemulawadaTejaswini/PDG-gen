import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;


public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int sum=0;
        int summ=0;
        for(int i=0;i<N;i++){
            sum=A[i];
            if(sum==0){
                summ++;
            }
            for(int j=i+1;j<N;j++){
                sum+=A[j];
                if(sum==0){
                    summ++;
                }


            }
        }
        System.out.println(summ);

        

        
}
        
        
    }
