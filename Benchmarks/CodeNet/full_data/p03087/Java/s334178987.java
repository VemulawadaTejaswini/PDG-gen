import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int q = s.nextInt();
		String inS = s.next();
		char[] chars = inS.toCharArray();
		char[] target = "AC".toCharArray();
		
		for(int i=0; i<q ;i++) {
			int start = s.nextInt();
			int end = s.nextInt();
			int count = 0;
			for(int j = start -1 ; j < end - 1 ; j ++) {
				if(chars[j] == target[0] && chars[j+1] == target[1]) {
					count++;
				}
			}
			System.out.println(count);
			
		}
		
		s.close();
		
	}

}