import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Long> nums = new ArrayList<Long>();

	static void dfs(int d, long val){
		nums.add(val);
		if(d >= 10) return;
		for(int i = -1; i <= 1; i++){
			int add = (int)(val % 10) + i;
			if(add >= 0 && add <= 9){
				dfs(d+1, val*10+add);
			}
		}
	}

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int K = sc.nextInt();
    	sc.close();
    	for(int i = 1; i < 10; i++){
    		dfs(1, i);
    	}
    	Collections.sort(nums);
    	System.out.println(nums.get(K-1));
    }
}