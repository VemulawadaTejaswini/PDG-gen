import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int X[]=new int [M];
        int Y[]=new int [M];
        int Z[]=new int [M];
        int counter=2;
        boolean d[]=new boolean [N];
        for(int i=0; i<M;i++){
            X[i]=sc.nextInt();
            Y[i]=sc.nextInt();
            Z[i]=sc.nextInt();
        }
        for(int j=0;j<N;j++){
            for(int k=0;k<M;k++){
                for(int l=0;l<M;l++){
                    if(j==X[k]&&j==Y[l]){
                        d[j]=true;
                    }
                }
            }
            if(d[j]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
