import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int K=sc.nextInt();
        int[]aa=new int[B-A+K+100];
        for(int i=0;i<K;i++){
            aa[A+i]++;
        }
        for(int i=0;i<K;i++){
            if(B-K+1+i>0){
            aa[B-K+1+i]++;}
        }
        for(int i=0;(i<=B);i++){
            if(i>=A){
            if(aa[i]>0){
                System.out.println(i);
            }}
        }
        }
        
        
    }
