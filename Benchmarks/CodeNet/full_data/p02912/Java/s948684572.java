import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long a[]=new long[N];
        for(int i=0; i<N; i++){
            a[i]=sc.nextLong();
        }

        
        
        Arrays.sort(a);

        long res=0;

        while(M>0){
            a[N-1] = a[N-1]/2;
            M--;
            Arrays.sort(a);
        }

        for(int i=0; i<N; i++){
            res = res+a[i];
        }  



        System.out.println(res);
        
        
        
        
        }
    }