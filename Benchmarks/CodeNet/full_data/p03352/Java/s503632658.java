import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    ArrayList<Integer>ans  = new ArrayList<>();
    
    for(int i=1; i<=x; i++) {
    	for(int j=2; j<=1000; j++) {
    		if(x >= (int)Math.pow(i, j)) {
    			ans.add((int)Math.pow(i, j));
    	}
    }
    }
    Collections.sort(ans,Collections.reverseOrder());
    			System.out.println(ans.get(0));
    	}
}