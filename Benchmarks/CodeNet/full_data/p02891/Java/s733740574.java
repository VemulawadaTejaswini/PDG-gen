import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc1 = new Scanner(System.in);
		String S = sc1.next();

		Scanner sc2 = new Scanner(System.in);
		int K = sc2.nextInt();

		String[] strList = S.split("");
		int[] changeList = new int[strList.length];

		for(int i = 0; i < strList.length - 2; i++){
			if(strList[i].equals(strList[i + 1])){
				strList[i + 1] = "*";
				changeList[i + 1] ++;
			}else{
				if(strList[i + 1].equals(strList[i + 2])){
					strList[i + 2] = "*";
					changeList[i + 2] ++;
				}
			}
		}

		if(strList[0].equals(strList[strList.length - 1])){
			strList[strList.length - 1] = "*";
			changeList[strList.length - 1]++;
		}

		double result = 0;
		for(int count : changeList){
			if(count > 0){
				result++;
			}
		}

		//
		System.out.println();
		for(String c : strList){
			System.out.print(c);
		}
		System.out.println();
		for(int n : changeList){
			System.out.print(n);
		}
		System.out.println();
		//
		System.out.println(String.format("%.0f", (result * K)));

		sc1.close();
		sc2.close();
	}
}
