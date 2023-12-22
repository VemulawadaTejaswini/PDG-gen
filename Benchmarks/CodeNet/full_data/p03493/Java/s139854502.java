import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] cstr = scanner.next().toCharArray();
		int count = 0;
		for(char c : cstr){
			if(c == '1'){
				count++;
			}
		}
		System.out.println(count);
	}

}
