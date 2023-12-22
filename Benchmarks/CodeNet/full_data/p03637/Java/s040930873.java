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
        int[]b=new int[N];
        int sum=1;
        for(int i=0;i<N;i++){
            if(a[i]%2==0){
                b[i]=0;
            }
            if(a[i]%4==0){
                b[i]=1;
            }
            if(a[i]%2==1){
                b[i]=-1;
            }
            sum+=b[i];
        }
        if(sum>=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }

        
        
    }
