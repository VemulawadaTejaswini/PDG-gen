import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int count = 0;
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i) != s.charAt(i+1)){
				count++;
			}
		}
		System.out.println(count);
	}

}
