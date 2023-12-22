import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner row = new Scanner(System.in);

		//値取得
		String rows = row.next();

		row.close();
		
		//表示する値を格納する
		int show = 0;
		
		//入力に対応する日数を格納する
		switch(rows){
			case "SUN":
				show = 7;
				break;
			case "MON":
				show =6;
				break;
			case "TUE":
				show =5;
				break;
			case "WED":
				show =4;
				break;
			case "THU":
				show =3;
				break;
			case "FRI":
				show =2;
				break;
			case "SAT":
				show =1;
				break;
				
		}
		
		//表示
		System.out.println(show);

	}

}
