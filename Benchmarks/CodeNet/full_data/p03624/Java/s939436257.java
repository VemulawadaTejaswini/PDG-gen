import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String line=new Scanner(System.in).nextLine();
		String abc="abcdefghijklmnopqrstuvwxyz";
		Character result = null;
		for(char a:abc.toCharArray()) {
			if(line.indexOf(a)<0) {
				result=a;
				break;
			}
		}
		System.out.println(result==null?"None":result);
	}
}