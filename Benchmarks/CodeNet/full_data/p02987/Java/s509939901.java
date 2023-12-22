import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char[] input= sc.next().toCharArray();
		Map<Character,Integer> map  = new HashMap<Character,Integer>();
		for(int i=0;i<input.length;i++) {
			if(!map.containsKey(input[i])) {
				map.put(input[i],0);
			}else {
				map.put(input[i],map.get(input[i])+1);
				if(map.get(input[i])>=2)System.out.println("No");
			}
		}
		System.out.println("Yes");
	}
}
