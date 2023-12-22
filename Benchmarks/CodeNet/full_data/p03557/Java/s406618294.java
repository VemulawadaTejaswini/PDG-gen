import java.util.*;	
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] parts = new int[3][N];
		int count = 0;
	    for(int i=0; i<3; i++) {
			for(int j = 0;j<N;j++) {
	    		parts[i][j]=sc.nextInt();
	    	}
	    }
	    for(int i=0; i<N; i++) {
	    	for(int j=0; j<N; j++) {
	    		for(int k=0; k<N; k++) {
	    			if(parts[0][i]<parts[1][j] && parts[1][j]<parts[2][k]) {
	    				count++;
	    			}
	    		}
	    	}
	    }
			
		System.out.println(count);
	}
}