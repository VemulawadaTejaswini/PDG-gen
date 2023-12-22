import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//N is number of rows, M is number of columns, D is how we are jumping by
		int N = sc.nextInt(), M = sc.nextInt(), D = sc.nextInt();
		//row[k] which row k is on, col[k] which column k is on
		int row[] = new int[N*M], col[] = new int[N*M];
		for(int i = 1; i<=N; i++){
		  for(int j = 1; j<=M; j++){
		    int k = sc.nextInt();
		    k--; //we make it 0 indexed to make life easier
		    row[k] = i; //store the row val
		    col[k] = j; //store the col val
		  }
		}
		int O[][] = new int[D][N*M/D+1];//represents the distance between (k*D+r) and ((k-1)*D+r)
		int P[][] = new int[D][N*M/D+1];//PSA for O[r]
		for(int r = 0; r<D; r++){//looping through remainders
		  for(int k = 1; k * D + r < N*M; k++){ //looping through all floor of D
		    int f = (k-1) * D + r; //first cell
		    int s = k * D + r; //second cell
		    O[r][k] = Math.abs(row[f] - row[s]) + Math.abs(col[f] - col[s]);
		  }
		}
		for(int r = 0; r<D; r++){
		  for(int k = 1; k * D + r < N*M; k++){
		    P[r][k] = P[r][k-1] + O[r][k]; //building psa
		  }
		}
		int Q = sc.nextInt();
		while(Q-->0){
		  int l = sc.nextInt(), r = sc.nextInt();
		  l--;
		  r--;
		//Get the remainder of D and the floor and do prefix sum.
		//We want O[remainder][l/D+1] --> O[remainder][r/D]
		  System.out.println(P[r%D][r/D] - P[l%D][l/D]);
		}

	}

}
