import java.util.*;
 
public class Main{
    public static void main(String[] args){
		public static final int MAX_N = 1000000;
        Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String a = sc.next();
		String b[] = new String[MAX_N];
		int d[][] = new int[MAX_N][MAX_N];
 
        for(int i=0; i<N; i++){
			b = a.split("");
			d[0][i]=Integer.valueOf(b[i]);
		}
	
		for(int i=1; i<N; i++){
			for(int j=0; j<N-i; j++){
				d[i][j]=Math.abs(d[i-1][j]-d[i-1][j+1]);
			}
		}

                System.out.println(d[N-1][0]);
    }
}