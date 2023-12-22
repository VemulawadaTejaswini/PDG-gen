import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println(cal(0,a,0));

    }
    public static int cal(int i,int[]a,int sum){
        if(a[i]==2) return ++sum;
        if(sum==a.length) return -1;
        sum++;
        return cal(a[i]-1,a,sum);
    }
}