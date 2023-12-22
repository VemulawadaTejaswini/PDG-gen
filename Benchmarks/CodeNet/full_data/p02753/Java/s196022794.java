import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		
		if(S.length()==3){
			char[] Si = new char[S.length()];

    		for(int i = 0; i < S.length(); i++){
            	 Si[i] = S.charAt(i);
            }

				if(Si[1]=='A' && Si[2]=='A' && Si[0]=='A'){
					System.out.println("No");
				}
				else if(Si[1]=='B' && Si[2]=='B' && Si[0]=='B'){
					System.out.println("No");
				}
				else{
					System.out.println("Yes");
				}
		}
	}
}
