import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int X=sc.nextInt();
        int[]A=new int[M];
        for(int i=0;i<M;i++){
            A[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<X;i++){
            out:for(int j=0;j<M;j++){
                if(i==A[j]){
                    sum++;
                    break out;

                }
            }
        }
        int summ=M-sum;
        System.out.println(Math.min(sum,summ));

}
        
        
    }
