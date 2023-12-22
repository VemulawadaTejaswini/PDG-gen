import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[]l=new int[N];
        for(int i=0;i<N;i++){
            l[i]=sc.nextInt();
        }
        Arrays.sort(l);
        System.out.println(l[N-1]+l[N-2]+l[N-3]);


}
        
        
    }
