import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x[]=new int[n+1];
        for(int i=0;i<n;i++){
            x[i]=0;
        }
        for(int i=0;i<m;i++){
            x[sc.nextInt()]++;
            x[sc.nextInt()]++;
        }
        for(int i=1;i<=n;i++){
            System.out.println(x[i]);
        }
        

    }
}