import java.util.*;

public class Main{
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int totalMochi = scanner.nextInt();
		ArrayList <Integer> mochiList = new ArrayList <Integer>();
		
		for (int index=0; index<totalMochi; index++) {
			int mochi = scanner.nextInt();
			
			if (hantei(mochi,mochiList)) {
				mochiList.add(mochi);
			}
		}
		
		System.out.println(mochiList.size());
	}
	
	private static boolean hantei (int mochi, ArrayList <Integer> mochiList) {
		
		boolean hantei = true;
		for (int index=0; index<mochiList.size(); index++) {
			int temp = mochiList.get(index);
			
			if (temp==mochi) {
				hantei=false;
			}
		}
		return hantei;
	}
}