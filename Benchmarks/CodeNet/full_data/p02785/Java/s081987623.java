import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    int N = scanner.nextInt();
	    int K = scanner.nextInt();
	    List<Integer> list = new ArrayList<Integer>();
	    
	    for(int i=0;i< N;i++){
	    	list.add(i,scanner.nextInt());
	    }
	    Collections.sort(list,Collections.reverseOrder());
	    if(K>N) {
	    	System.out.println(0);
	    }else {
	     
	     int j = 0;
	     while(j<K) {
	    	 int i = 0;
	    	 list.remove(i);
	    	 j++;
	     }
	     long sum = 0;
	     for(int i = 0;i < N - K; i++) {
	    	 sum = list.get(i) + sum;
	     }
	     System.out.println(sum);
	}
	}
}
