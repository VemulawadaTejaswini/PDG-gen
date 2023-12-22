import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static java.lang.Math.ceil;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		Map<String, Integer> alpMap = new HashMap<String, Integer>();
		for(int i=0;i<input.length()-2;i++){
			alpMap.clear();
			putAlp(alpMap, input.charAt(i));
			putAlp(alpMap, input.charAt(i+1));
			
			for(int n=i+2;n<input.length();n++){
				
				putAlp(alpMap, input.charAt(n));
				
				if (checkBalance(alpMap, n -i)){
					int indx4printSt = i + 1;
					int indx4printEd = n + 1;
					System.out.print(indx4printSt + " " + indx4printEd);
					return;
				}
			}
		}
		System.out.print("-1 -1");
	}

	public static void putAlp(Map<String, Integer> mp, char alp){
		
		String alpStr = String.valueOf(alp);
		if(mp.containsKey(alpStr)){
			int tmpCount = mp.get(alpStr);
			mp.put(alpStr, tmpCount+1);
		}
		else{
			mp.put(alpStr, 1);
		}
	}
	
	public static boolean checkBalance(Map<String, Integer> mp, int strL){
		boolean result = false;
		
		for (Map.Entry<String, Integer> entry : mp.entrySet()){
			if(entry.getValue() > ceil(strL/2)){
				result = true;
			}
		}
		
		return result;
	}
}