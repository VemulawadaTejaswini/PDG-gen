import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	long[] ary = new long[N];
    	for(int i = 0; i < N; i++){
    		 ary[i] = sc.nextInt();
    	}
    	sc.close();
    	boolean flg = true;
    	int cnt = N-1;
    	while(flg){
    		Arrays.sort(ary);
    		for(int i = 0; i < N; i++){
    			if(ary[i] > 0){
    				long min = ary[i];
	    			for(int j = i+1; j < N; j++){
	    				ary[j] = (ary[j] % min) >= 0 ? ary[j] % min : ary[j];
	        			if(ary[j] == 0) cnt--;
	    			}
	    			break;
    			}
    		}
    		if(cnt == 0) flg = false;
    	}
    	Arrays.sort(ary);
    	System.out.println(ary[N-1]);
    }
}
