import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int K = scan.nextInt();

	int[] A_ = new int[N];
	for(int i = 0; i < N; i++){
	    A_[i] = scan.nextInt();
	}

	int[] map_ = new int[N+1];
	int kind = 0;
	for(int i = 0; i < N; i++){
	    if(map_[A_[i]] == 0){
		kind++;
	    }
	    map_[A_[i]]++;
	}

	Arrays.sort(map_);

	int num = 0;
	for(int i = 0; i <= N; i++){
	    if(kind > K){
		if(map_[i] != 0){
		    num += map_[i];
		    kind--;
		}
	    }else{
		break;
	    }
	}

	System.out.println(num);
    }
}
