import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int length = s.nextInt();
		int q = s.nextInt();
		String inS = s.next();
		char[] chars = inS.toCharArray();
		char[] target = {'A','C'};
		
		int start;
		int end;
		int count =0 ;
		int i,j;
		int[] pos = new int[chars.length /2];
		
		for(j = 0 ; j < length - 1 ; j ++) {
			if(chars[j] == target[0] && chars[j+1] == target[1]) {
				pos[count] = j;
				count++;
				j++;
			}
		}
		
		int result;
		for(i=0; i<q ;i++) {
			start = s.nextInt();
			end = s.nextInt();
			result = 0;
			for(j = 0 ; j < count; j++) {
				if(pos[j] >= start - 1 && pos[j] <= end -2) {
					result++;
				}
			}
			System.out.println(result);
		}
		
		
	}

}