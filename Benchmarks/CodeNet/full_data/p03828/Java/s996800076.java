import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String N_moji = br.readLine();
	int N = Integer.parseInt(N_moji);
	long i,j,count = 1;

	for(i = 2; i <= N; i++){
	    if(sosuu(i)){
		count = (count * (kazu(i, N)+1)) % ((long)Math.pow(10,9) + 7);
	    }
	}
	System.out.println(count);	
    }
	
    public static boolean sosuu(long i){
	long j,dame = 0;
	if(i == 1){
	    return false;
	}else{
	    for(j = 2; j < i; j++){
		if((i % j) == 0){
		    dame++;
		}
	    }
	    if(dame > 0){
		return false;
	    }else{
		return true;
	    }
	}
    }

    public static long kazu(long i, int N){
	long j,k,count = 0;
	for(j = 2; j <= N; j++){
	    k = j;
	    while(k % i == 0){
		count++;
		k /= i;
	    }
	}
	return count;
    }
}
