import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int x = 0;
		String[] str = new String[n];
		int[] result = new int[n];
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			str[i] = s.substring(i, i + 1);
			if(str[i].equals("I")) {
				x += 1;
			}else {
				x -= 1;
			}
			result[i] += x;
			if(max < result[i]){
				max = result[i];
			}
		}
		System.out.println(max);
	}

}