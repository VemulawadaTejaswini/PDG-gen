import java.util.Scanner;

public class Main{
	
	public static boolean isConcat(String s){
		if((s.length()%2)!=0){
			return false;
			}
		int a = 0,b = s.length()/2;
		
		for(int i = 0;i<s.length()/2;i++){
			if(s.charAt(a+i)!=s.charAt(b+i)){
				return false;
				}
			}
		return true;
		}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		if(isConcat(s)){
			System.out.println("Yes");
			}

		else{
			System.out.println("No");
			}

	}
}