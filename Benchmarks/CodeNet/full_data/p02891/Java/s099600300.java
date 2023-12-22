import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int K = sc.nextInt();
		sc.close();

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

		System.out.println(String.format("%.0f", (result * K)));
	}
}