import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        String S[]=new String[N];
        for(int i=0; i<N;i++){
            S[i]=sc.next();
        }
        S[K-1]=S[K-1].toLowerCase();
        for(int j=0;j<N;j++){
            System.out.print(S[j]);
        }
    }
}