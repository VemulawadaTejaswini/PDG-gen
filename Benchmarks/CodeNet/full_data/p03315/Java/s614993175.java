import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sr = new Scanner(System.in);
		String s = sr.next();
		int c = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.substring(i, i + 1).equals("+")){
				c++;
			}else{
				c--;
			}
		}
		System.out.println(c);
	}
}