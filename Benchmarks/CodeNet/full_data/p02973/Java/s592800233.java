
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = sc.nextInt();
        
        for(int i = 0; i < N-1; i++) {
        	int tmp = sc.nextInt(); 
        	if(n>=tmp) {
        		if(array.isEmpty()) {
        			array.add(n);
        			n = tmp;
        		}else {
        			int loop = array.size();
        			for(int j = 0; j < loop; j++) {
        				if(array.get(j)<tmp) {
        					int tmp2 = n;
        					n = array.get(j);
        					array.remove(j);
        					array.add(tmp2);
        					break;
        				}
        				array.add(n);
        				n = tmp;
        			}
        		}
        	}else {
        		n = tmp;
        	}
        }
        System.out.println(array.size());
        
	}
}
