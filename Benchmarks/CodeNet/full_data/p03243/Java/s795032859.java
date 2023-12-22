import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner scan = new Scanner (System.in);

		//入力された値を取得
		//第何回大会
		String n = scan.next();

		String n1 = n.substring(0,1);
		String n2 = n.substring(1,2);
		String n3 = n.substring(2, 3);
		//int型に変換
		int no1 = Integer.parseInt(n1);
		int no2 = Integer.parseInt(n2);
		int no3 = Integer.parseInt(n3);
		//次回大会
		String nextCt = "";

		if(n1.equals(n2) && n2.equals(n3)) {
			nextCt = n;
		}else {
			if(no1<no2) {
				no1 = no1+1;
				no2 = no1;
				no3 = no1;
				nextCt = String.valueOf(no1)+String.valueOf(no2)+String.valueOf(no3);
			}else if(no1>no2){
				no2 = no1;
				no3 = no1;
				nextCt = String.valueOf(no1)+String.valueOf(no2)+String.valueOf(no3);
			}
		}


		System.out.println(nextCt);
	}

}
