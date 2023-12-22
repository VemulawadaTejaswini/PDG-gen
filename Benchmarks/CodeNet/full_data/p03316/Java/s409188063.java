import java.util.*;
public class Main{
	public static void main(String[] args){

		Scanner sr = new Scanner(System.in);
		String s = sr.next();
		int sum = 0;
		for(int i = 0; i < s.length(); i++){
			sum = sum + Integer.parseInt(s.substring(i, i + 1));
		}
		if(Integer.parseInt(s) % sum == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}