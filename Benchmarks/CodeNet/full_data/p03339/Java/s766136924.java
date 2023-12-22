import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		
		int left = 0;
		int right;
		int min = (int) (3 * Math.pow(10, 5));
		
		n = sc.nextInt();
		s = sc.next();
		
		right = s.replaceAll("W", "").length();
		
		char [] sarray = s.toCharArray();
		
		for(int i = 0; i < n ; i++){
			
			if(sarray[i] == 'E')
				right--;
			
			min = Math.min(min, left + right);
			
			if(sarray[i] == 'W')
				left++;
			
		}
		System.out.println(min);
	}
}
