import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		int target = cin.nextInt();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int tmp;
		for(int i=0;i<target;i++){
			tmp=cin.nextInt();
			if(map.containsKey(tmp)){
				map.put(tmp, map.get(tmp)+1);
			}else{
				map.put(tmp, 1);
			}
		}

		int count = map.size();
		int result;
		int sum=0;
		if(count==1){
			result=1;
		}else{
			for(int key : map.keySet()){
				sum += map.get(key)-1;
			}
			if(sum%2==0){
				result = count;
			}else{
				result = count-1;
			}
		}
		System.out.println(result);
	}
}
