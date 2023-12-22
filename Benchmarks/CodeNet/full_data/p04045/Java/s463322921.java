import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
    	new B().doIt();
    }
    class B{
    	void doIt(){
    		int n = sc.nextInt();
    		int k = sc.nextInt();
    		boolean array[] = new boolean[10];
    		boolean nn[] = new boolean[100000];
    		ArrayList<Integer> number = new ArrayList<Integer>();
    		for(int i = 0;i < k;i++){
    			int num = sc.nextInt();
    			array[num] = true;
    		}
    		for(int i = 0;i < 10;i++){
    			if(!array[i])number.add(i);
    		}
    		nn[0] = true;
    		for(int i = 0;i < 100000;i++){
    			if(nn[i]){
//    				System.out.println(i);
    				if(i >= n){
    					System.out.println(i);
    					break;
    				}
    				for(int j = 0;j < number.size();j++){
    					if(i+number.get(j) > 100000)continue;
    					nn[i*10+number.get(j)] = true;
    				}
    			}
    		}
    	}
    }
}