import java.util.Scanner;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	HashMap<Long, Integer> hash = new HashMap<Long, Integer>();

	long[] A_ = new long[N];
	for(int i = 0; i < N; i++){
	    A_[i] = scan.nextLong();
	    if(hash.containsKey(A_[i])){
		if(hash.get(A_[i]) == 1){
		    hash.put(A_[i], 0);
		}else{
		    hash.put(A_[i], 1);
		}
	    }else{
		hash.put(A_[i], 1);
	    }
	}

	int count = 0;
	for(int i = 0; i < N; i++){
	    if(hash.get(A_[i]) == 1){
		count++;
	    }else{
	    }
	}

	System.out.println(count);
    }
}
