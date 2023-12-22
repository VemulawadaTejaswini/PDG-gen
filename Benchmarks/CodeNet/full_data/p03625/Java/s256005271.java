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
        int x=0;
        int y=0;
        int hantei=0;
        out:for(int i=N-1;i>0;i--){
            if(hantei==0){
                if(a[i]==a[i-1]){
                    x=a[i];
                    hantei=1;
                    a[i]=-1;
                    a[i-1]=-1;
                }
            }
            else if(hantei==1){
                if(a[i]==a[i-1]){
                    y=a[i];
                    break out;
                }
            }
            if(i==1){
                x=0;
                y=0;
            }

        }
        System.out.println(x*y);


        

        
}
        
        
    }
