import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		int max = 0;
		int count = 0;
		for(int i=0;i<n;i++){
			if(s.charAt(i) == 'I'){
				count++;
			}else{
				count--;
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
	}

}
