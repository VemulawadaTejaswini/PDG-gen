import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
	//	int res = 0;
	//	boolean get = false;
	//	boolean getZ = false;
		int s = 0;
		int f = 0;
		for(int i = 0 ; i<input.length(); i++){
			if(input.charAt(i) == 'A'){
				s = i+1;
				break;
			}
		}
		for(int i = input.length()-1; i>=0; i--){
			if(input.charAt(i) == 'Z'){
				f = i+1;
				break;
			}
		}
	//	System.out.println(f + " " + s);
		int res = f-s+1;
		if(res<=0)res = 0;
		System.out.println(res);
	}
}
