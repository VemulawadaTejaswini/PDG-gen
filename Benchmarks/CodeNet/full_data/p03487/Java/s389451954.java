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
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int x=1;
        int sum=0;
        if(N>1){
        for(int i=0;i<N-1;i++){
            if(a[i]==a[i+1]){
                x++;
            }else{
                if(x>a[i]){
                    sum+=x-a[i];
                }
                if(x<a[i]){
                    sum+=x;
                }
                x=1;
            }
            if(i==N-2){
                if(x>a[i]){
                    sum+=x-a[i];
                }
                if(x<a[i]){
                    sum+=x;
                }
                x=1;

            }
        }}else{
            if(a[0]==1){
                sum=1;
            }else{
                sum=0;
            }
        }
        System.out.println(sum);

    }

        
        
    }
