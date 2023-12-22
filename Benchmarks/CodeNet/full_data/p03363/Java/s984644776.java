import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] arr = new int[sc.nextInt()+1];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>(); 
		arr[0] = 0;
		map.put(0, 1);
		for(int i=1;i<arr.length; i++){
			arr[i] = arr[i-1] + sc.nextInt();
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		for(Integer i : map.values()){
			count += (int) i*(i-1)/2;
		}
		System.out.println(count);
	}

}
