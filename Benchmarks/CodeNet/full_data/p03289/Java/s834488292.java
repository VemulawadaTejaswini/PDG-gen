import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		
		boolean ruleA = false;
		boolean ruleB = false;
		boolean ruleC = false;
		
		if(S.charAt(0) == 'A'){
			ruleA = true;
			int countC = 0;
			for(int a = 1 ; a < S.length() ; a++){
				String searchChar = String.valueOf(S.charAt(a));
				if(1<a && a<S.length()-1 && searchChar.equals("C")){
					countC++;
					if(countC == 1){
						ruleB = true;
					}else{
						ruleB = false;
						break;
					}
				}else{
					if(searchChar.matches("[a-z]")){
						ruleC = true;
					}else{
						break;
					}
				}				
			}			
		}
		if(ruleA && ruleB && ruleC){
			System.out.println("AC");
		}else{
			System.out.println("WA");
		}
	}
}