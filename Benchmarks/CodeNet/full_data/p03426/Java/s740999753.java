import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        int a[][]=new int[H+1][W+1];
        int x[]=new int[H*W+1];
        int y[]=new int[H*W+1];
        for(int i=1; i<H+1; i++){
            for(int j=1; j<W+1; j++){
                a[i][j]=sc.nextInt();
                x[a[i][j]]=j;
                y[a[i][j]]=i;
            }
        }
        int Q = sc.nextInt();
        int L[]=new int[Q];
        int R[]=new int[Q];
        for(int i=0; i<Q; i++){
            L[i]=sc.nextInt();
            R[i]=sc.nextInt();
        }
        
        
        int sum=0;
        int res=0;
        int count;
        
        for(int j=0; j<Q; j++){
            count=0;
            for(int i=L[j]; i<R[j]; i=i+D){
                    count=count+Math.abs(x[i+D]-x[i])+Math.abs(y[i+D]-y[i]);
            }
            System.out.println(count);
        }
        

        
        
        
        
        
        
        
        
        
        
          
        }
    }