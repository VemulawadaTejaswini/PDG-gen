import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		String T = scanner.nextLine();
		int count = 0;
		if(S.substring(0,1).equals(T.substring(0,1))){
			count++;
		}if(S.substring(1,2).equals(T.substring(1,2))){
			count++;
		}if(S.substring(2,3).equals(T.substring(2,3))){
			count++;
		}
		System.out.println(count);
		}
	}
