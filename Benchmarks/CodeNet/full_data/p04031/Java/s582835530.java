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
        int[]a=new int[N];
        int max=-1000;
        int min=1000;
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0;i<N;i++){
            if(a[i]<min){
                min=a[i];
            }
        }        
        int kk=max+min;
        if(kk%2==0){
            kk=kk/2;
            int sum=0;
            for(int i=0;i<N;i++){
                sum+=(a[i]-kk)*(a[i]-kk);
            }
            System.out.println(sum);
            
        }else{
            int kkk=kk/2;
            kk=kk/2+1;
            int sum=0;
            for(int i=0;i<N;i++){
                sum+=(a[i]-kk)*(a[i]-kk);
            }
            int summ=0;
            for(int i=0;i<N;i++){
                summ+=(a[i]-kkk)*(a[i]-kkk);
            }
            System.out.println(Math.min(sum,summ));
        }
}
        
        
    }
