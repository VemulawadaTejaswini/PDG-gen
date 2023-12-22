import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String targetString = "AC";
		Scanner scanner = new Scanner(System.in);
		String inputNQ = scanner.nextLine();
		
		String[] listInputNQ = inputNQ.split(" ");
		
		String inputS = scanner.nextLine();
		
		List<String> listInput = new ArrayList<String>();	
		System.out.println(listInputNQ[1]);
		for (int i = 0; i < Integer.parseInt(listInputNQ[1]); i++) {
			String tmpInput = scanner.nextLine();
			listInput.add(tmpInput);
		}
		
		for (String inputQ : listInput) {
			String[] tmpQ =  inputQ.split(" ");
			int[] q = new int [] {Integer.parseInt(tmpQ[0]) , Integer.parseInt(tmpQ[1])};
			String tmpS = inputS.substring(q[0]-1,q[1]);
			int resultCount=0;
			for (int j = 0 ; j < tmpS.length()-1 ; j ++) {
				System.out.println(tmpS + " / " + tmpS.substring(j,j+2));
				if(targetString.equals(tmpS.substring(j,j+2))) {
					resultCount ++;
				}
			}
			System.out.println(resultCount);
		}
		
		scanner.close();
	}
}