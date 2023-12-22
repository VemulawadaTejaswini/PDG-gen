
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();


		String[] splitS = s.split("");
//		for(int i = 0;i < splitS.length;i++) {
//			System.out.print(splitS[i]);
//		}
		int positionA = 0;
		for(int i = 0;i < splitS.length;i++) {
			if(splitS[i].equals("A")) {
				positionA = i;
				break;
			}
		}
		int positionZ = 0;
		for(int i = positionA;i < splitS.length;i++) {
			if(splitS[i].equals("Z")) {
				positionZ = i;
			}
		}
//		System.out.print(positionA);
//		System.out.print(positionZ);

//		for(int i = positionA;i <= positionZ;i++) {
			System.out.println(positionZ-positionA+1);
//	}
	}

}
