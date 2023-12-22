import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		System.out.println(getMinNumOfRepaints(S));
	}
	
	private static int getMinNumOfRepaints(String s) {
		if(s.length() <= 1) return 0;
		
		char[] arr = s.toCharArray();
		// starting from '0'
		char[] case1 = new char[arr.length];
		// starting from '1'
		char[] case2 = new char[arr.length];
		
		// fill in case1
		for(int i = 0; i < arr.length; i++) case1[i] = i % 2 == 0? '0':'1';
		// fill in case2
		for(int i = 0; i < arr.length; i++) case2[i] = i % 2 == 0? '1':'0';
		
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < arr.length; i++){
			// for case1
			if(case1[i] != arr[i]) count1++;
			if(case2[i] != arr[i]) count2++;
		}
		
		return Math.min(count1, count2);
	}
}
