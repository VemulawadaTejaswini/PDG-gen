import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int X=sc.nextInt();
        int[] m=new int[N];
        
        for(int i=0;i<N;i++){
            m[i]=sc.nextInt();
        }
        int rest=X;
        int min=X;
        for(int i=0;i<N;i++){
            rest-=m[i];
            if(min>m[i]){
                min=m[i];
            }
        }
        
        System.out.println(N+rest/min);
    }
}