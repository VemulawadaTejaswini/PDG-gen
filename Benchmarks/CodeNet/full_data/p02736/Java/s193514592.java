import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		String a = sc.next();
		String b[] = new String[N];
		int d[][] = new int[N][N];
 
        for(int i=0; i<N; i++){
			b = a.split("");
		}
		for(int i=0; i<N; i++){
			d[0][i]=Integer.valueOf(b[i]);
		}
	
		for(int i=1; i<N; i++){
			for(int j=0; j<N-i; j++){
				if(j+1<N-i)
				d[i][j]=Math.abs(d[i-1][j]-d[i-1][j+1]);
			}
		
		}

                System.out.println(d[N-1][0]);
    }
}