import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer count = sc.nextInt();
		ArrayList<Integer> mochiList = new ArrayList<Integer>();
		for(int i = 0; i < count; i++){
			Integer target = sc.nextInt();
			boolean duplicateFlag = false;
			for(int j = 0; j < mochiList.size(); j++){
				Integer tmp = mochiList.get(j);
				if(tmp.equals(target)){
					duplicateFlag = true;
				}
			}
			if(!duplicateFlag){
				mochiList.add(target);
			}
		}
		System.out.println(mochiList.size());
	}
}