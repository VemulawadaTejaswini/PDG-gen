import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]a=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int[]b=new int[N];
        for(int i=0;i<N;i++){
            b[i]=a[i]/2;
        }
        int maxx=0;
        int[]c=new int[N];
        for(int k=0;k<N;k++){
        out:for(int i=0;;i++){
            int x=b[i];
            for(int j=0;j<N;j++)
            {
                if(x+i==a[j]){
                    c[k]=a[j];
                    break out;
                    
                }
                if(x-i==a[j]){
                    c[k]=a[j];
                    break out;
                }
                
            }
            
        }}
        int max=0;
        int x=0;
        int y=0;
        for(int i=0;i<N;i++){
            int aa=keisan(a[i],c[i]);
            if(aa>=max){
                x=a[i];
                y=c[i];
            }
        }
        System.out.println(x+" "+y);
        


}
public static int keisan(int a,int b){
    int sum=1;
    for(int ns=a-b+1,ms=1;ms<=b;ns++,ms++){
        sum*=ns;
        sum/=ms;
    }
    return sum;
}
        
        
    }
