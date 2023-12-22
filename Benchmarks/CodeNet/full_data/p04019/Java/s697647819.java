import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {
		String result = "No";
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		Set<String> nsweExistSet = new HashSet<String>();
		for(int i=0;i<input.length();i++){
			String tmpS = String.valueOf(input.charAt(i));
			nsweExistSet.add(tmpS);
			if(nsweExistSet.size() == 4){
				break;
			}
		}
		
		if(nsweExistSet.contains("N")&&nsweExistSet.contains("S")
				&&nsweExistSet.contains("W")&&nsweExistSet.contains("E")){
					result = "Yes";
		}
		else if(nsweExistSet.contains("N")&&nsweExistSet.contains("S")
				&&!nsweExistSet.contains("W")&&!nsweExistSet.contains("E")){
			result = "Yes";
		}
		else if(!nsweExistSet.contains("N")&&!nsweExistSet.contains("S")
				&&nsweExistSet.contains("W")&&nsweExistSet.contains("E")){
			result = "Yes";
		}
		
		System.out.print(result);
	}
}