import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	int[] sn = new int[N+1];
	for(int i=0;i<N-1;i++){
	    sn[ sc.nextInt() ]++;
	}
	for(int i=1;i<=N;i++){
	    System.out.println(sn[i]);
	}
    }			    
}
