import java.util.Scanner;

public class TaskA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		String result = "";
		for(int i = 0; i < line.length(); i ++){
			if(line.charAt(i)==','){
				result += ' ';
			}else{
				result += line.charAt(i);
			}
		}
		System.out.println(result);
	}
}
