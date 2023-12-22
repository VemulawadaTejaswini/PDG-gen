

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		List<Integer> listInput = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		int numSousa = sc.nextInt();
		int target = sc.nextInt();
		
		for(int i=0;i<numSousa;i++){
			int tmpNum = sc.nextInt();
			int tmpCount = sc.nextInt();

			for(int j=0;j<tmpCount;j++){
				listInput.add(tmpNum);
			}
		}
		sc.close();
		
		Collections.sort(listInput);
		
		System.out.print(listInput.get(target - 1));
		
		return;
	}
}