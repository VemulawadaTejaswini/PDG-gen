import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String result = "";
		if(a.equals(b)){
			result = "EQUAL";
		}else if(a.length() > b.length()){
			result = "GREATER";
		}else if(a.length() < b.length()){
			result = "LESS";
		}else{
			if(a.compareTo(b) == 1){
				result = "GREATER";
			}else{
				result = "LESS";
			}
		}
		System.out.println(result);
	}
}
