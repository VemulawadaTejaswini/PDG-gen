import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String [] sArray = s.split("");
		int len = sArray.length;
		boolean judge = true;
		int Ccount = 0;
		if(sArray[0].equals("A"));//1文字目の”A”判定
		else judge = false;
		if(sArray[1].equals(sArray[1].toUpperCase())) judge = false;//２文字目の(大小)判定
		for(int i = 2; i <= len - 2; i++) {//3文字目と末尾から2文字目の間
			if(sArray[i].equals("C")) Ccount++;//”C”カウント
			else if(sArray[i] == sArray[i].toUpperCase()) judge = false;//(大小)判定
		}
		if(Ccount != 1) judge = false;//”C”の数判定
		if(sArray[len - 1].equals(sArray[len - 1].toUpperCase())) judge = false;//末尾文字の(大小)判定
		
		if(judge) System.out.println("AC");//結果出力
		else System.out.println("WA");
		
		sc.close();
	}
}
