import java.util.ArrayList;
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
		int answer = rList.size() * gList.size() * bList.size();
		for(Integer red : rList) {
			for(Integer green : gList) {
				if(red > green) {
					if(bList.indexOf(red + (red -green)) != -1) {
						answer--;
					}
					if(bList.indexOf(green - (red -green)) != -1) {
						answer--;
					}
				}else {
					if(bList.indexOf(green + (green -red)) != -1) {
						answer--;
					}
					if(bList.indexOf(red - (green -red)) != -1) {
						answer--;
					}
				}
				if((red + green)%2 ==0 ) {
					if(bList.indexOf((red +green)/2) != -1) {
						answer--;
					}
				}

			}
		}
		System.out.println(answer);
	}

}