import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] sArray = sc.next().split("");
		List<Integer> rList = new ArrayList<Integer>();
		List<Integer> gList = new ArrayList<Integer>();
		List<Integer> bList = new ArrayList<Integer>();
		for(int i =0;i < sArray.length;i++) {
			if(sArray[i].equals("R")) {
				rList.add(i +1);
			}
			if(sArray[i].equals("G")) {
				gList.add(i +1);
			}
			if(sArray[i].equals("B")) {
				bList.add(i +1);
			}
		}
		int answer = 0;
		for(Integer red : rList) {
			for(Integer green : gList) {
				for(Integer blue : bList) {
					int[] array = {red,green,blue};
					Arrays.sort(array);
					if(array[1] -array[0] !=array[2] -array[1]) {
						answer++;
					}
				}
			}
		}


		System.out.println(answer);
	}

}