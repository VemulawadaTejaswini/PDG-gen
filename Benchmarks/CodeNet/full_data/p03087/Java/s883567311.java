import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String targetString = "AC";
		Scanner scanner = new Scanner(System.in);
		String inputNQ = scanner.nextLine();
		String[] listInputNQ = inputNQ.split(" ");		
		String inputS = scanner.nextLine();
		
		for (int i = 0; i < Integer.parseInt(listInputNQ[1]); i++) {
			String tmpInput = scanner.nextLine();
			String[] tmpQ =  tmpInput.split(" ");
			int[] q = new int [] {Integer.parseInt(tmpQ[0]) , Integer.parseInt(tmpQ[1])};
			String beforeReplaceS = inputS.substring(q[0]-1,q[1]);
			String afterReplaceS =  beforeReplaceS.replaceAll(targetString, "");
			int replaceLength = beforeReplaceS.length() - afterReplaceS.length();
			if(replaceLength == 0) {
				System.out.println(replaceLength);
			}else {
				System.out.println(replaceLength/2);
			}
		}
		
		scanner.close();
	}
}