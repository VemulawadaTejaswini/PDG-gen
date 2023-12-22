import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
	     String str = scan.nextLine();
	     String[] chars = str.split(" ");
	     int N = Integer.valueOf(chars[0]);
	     int M = Integer.valueOf(chars[1]);
	     String[] StringPrices = scan.nextLine().split(" ");
	     List<Integer> prices = new ArrayList<>();
	     for(int i=0;i<N;i++) {
	    	 prices.add(Integer.valueOf(StringPrices[i]));
	     }
	     prices.sort(null);
	     for(int i=0;i<M;i++) {

	    	 prices.set(prices.size()-1, prices.get(prices.size()-1)/2);
	    	 prices.sort(null);
	     };
	     int sum=0;
	     for(int p:prices)
	    	 sum=sum+p;
	     System.out.println(sum);
	}

}
