import java.util.*;
class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextInt();
		if(s.length() < 4){
			System.out.println("No");
		} else {
			if(s.substring(0,5).equals("YAKI"){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}