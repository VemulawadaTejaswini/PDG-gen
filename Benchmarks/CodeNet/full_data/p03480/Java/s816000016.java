import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int c = 0;

		for(int i = 0;i < in.length();++i){
			if(in.charAt(i) == '0') ++c;
		}

		System.out.println(c);
	}
}