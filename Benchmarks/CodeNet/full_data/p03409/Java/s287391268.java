import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]a=new int[N];
        int[]b=new int[N];
        int[]c=new int[N];
        int[]d=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            c[i]=sc.nextInt();
            d[i]=sc.nextInt();
        }
        int[]e=new int[N];
        for(int i=0;i<N;i++){
            e[i]=a[i]*a[i]+b[i]*b[i];
        }
        int[]f=new int[N];
        for(int i=0;i<N;i++){
            f[i]=c[i]*c[i]+d[i]*d[i];
        }
        int[]l=new int[N];
        for(int i=0;i<N;i++){
            l[i]=0;
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(f[i]>e[j]){
                    if((c[i]>a[j])&&(d[i]>a[j])){
                        l[i]++;
                    }
                }
            }
        }





        int sum=0;
        for(int i=0;i<N;i++){
            int aa=0;
            if(l[i]>0){
            for(int j=i+1;j<N;j++){
                if(l[i]==l[j]){
                    aa++;
                    l[j]=0;
                }
            }if(aa==0){
                aa++;
            }}
            if(aa>=l[i]){
                sum+=l[i];
            }else{
                sum+=aa;
            }
        }
        System.out.println(sum);
        

        

       
        
    }}