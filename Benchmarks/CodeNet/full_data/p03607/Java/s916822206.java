import java.util.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args){  
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int[]A=new int[N];
    for(int i=0;i<N;i++){
        A[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
        if(A[i]!=0){
        for(int j=0;j<i;j++){
            if(A[i]==A[j]){
                A[i]=0;
                A[j]=0;
            }
        }}
    }
    int kazu=0;
    for(int i=0;i<N;i++){
        if(A[i]!=0){
            kazu++;
        }
    }
    System.out.println(kazu);

    
    }
}