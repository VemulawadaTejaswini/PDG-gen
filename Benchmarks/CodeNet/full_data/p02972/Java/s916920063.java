
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scan = new Scanner(System.in);
		    int N  = scan.nextInt();

	        List<Integer> x = new ArrayList<Integer>();
	        List<Integer> y = new ArrayList<Integer>();
	        x.add(0);
	        for(int i=0;i<N;i++) {
	        	x.add(scan.nextInt());
	        	//y.add(x.get(i));
	        }
	        int flag = 0;
	    	int sum =0;
	        for(int i=1; i< N+1 ; i++) {
	        	sum =0;
	        	for(int j=i; j < N+1; j = j+i ) {
	        		sum += x.get(j);
	        	}
	        	if(sum % 2 == x.get(i)) {
	        		flag = i;
	        		System.out.println(String.valueOf(sum));
	        		break;
	        	}
	        }
	        if(flag ==0) {
	        	System.out.println("-1");
	        	return ;
	        }
	        int j=0;

	        for(int i=1;i<N+1;i = i+flag) {
	        	if(x.get(i) ==1) {
	        		System.out.print(String.valueOf(i)+" ");
	        		j++;
	        	}
	        }

	}

}
