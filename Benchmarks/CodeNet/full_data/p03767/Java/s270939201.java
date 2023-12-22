import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();

	int[] a_ = new int[3*N];
	for(int i = 0; i < 3*N; i++){
	    a_[i] = scan.nextInt();
	}

	Arrays.sort(a_);
	
	int[][] team_ = new int[N][3];
	for(int i = 0; i < 3; i++){
	    for(int j = 0; j < N; j++){
		team_[j][i] = a_[i*N+j];
	    }
	}

	long ans = 0;
	for(int i = 0; i < N; i++){
	    ans += team_[i][1];
	}

	System.out.println(ans);
    }
}
