import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//アルファベットを用意
		String alf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		//配列にする
		String[] alfList = alf.split("");
		
		/*
		 * Scannerで値取得。
		 */
		Scanner sForNum = new Scanner(System.in);
		Scanner row = new Scanner(System.in);

		//値取得
		int num = sForNum.nextInt();
		String rows = row.next();

		row.close();
		sForNum.close();
		
		//１文字ずつ配列に格納する
		String[] arrStr = rows.split("");
		
		String[] arrShow = new String[arrStr.length];
		
		//入力された文字配列分繰り返す
		for(int i = 0; i < arrStr.length; i++) {
			
			for(int j = 0; j < alfList.length; j++) {
				//アルファベットが一致した際
				if(arrStr[i].equals(alfList[j])) {
					//num分ずらして表示用配列に格納
					arrShow[i] = alfList[(j+num)%26];
				}
			}
		}
		for(String str : arrStr) {
		//表示
		System.out.print(str);
		}
	}
}
