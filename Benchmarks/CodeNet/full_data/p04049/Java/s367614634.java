import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
    	new C().doIt();
    }
    class C{
    	void doIt(){
    		int n = sc.nextInt();
    		int large = sc.nextInt();
    		int array [] = new int [n];
    		ArrayList<ArrayList<Integer>> node = new ArrayList<ArrayList<Integer>>();
    		for(int i = 0;i < n;i++){
    			node.add(new ArrayList<Integer>());
    		}
    		int length = 0;
    		for(int i = 0;i < n-1;i++){
    			int s = sc.nextInt()-1;
    			int e = sc.nextInt()-1;
    			array[s]++;
    			array[e]++;
    			node.get(s).add(e);
    			node.get(e).add(s);
    			if(array[s] == 1 || array[e] == 1)length++;
    		}
    		if(length == large)System.out.println(0);
    		else{
    			while(length != large){
    				int pos = 0;
    				for(int i = 0;i < n;i++){
    					if(array[i] == 1){
    						int num = node.get(i).get(0);
    						if(array[pos] > array[num]){
    							pos = num;
    						}
    					}
    				}
    				int ll = node.get(pos).size();
    				ArrayList<Integer> aa = node.get(pos);
    				array[pos] = 1;
    				for(int i = ll-1;i >= 0;i--){
    					if(array[aa.get(i)] == 1){
    						array[aa.get(i)] = 0;
    						node.remove(i);
    					}
    				}
    				length--;
    			}
    			System.out.println(length);
    		}
    	}
    }
}