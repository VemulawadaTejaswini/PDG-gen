import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		int changeNum = 0;
		int sNum = 0;

		Scanner sNumScan = new Scanner(System.in);
		sNum = sNumScan.nextInt();
		Scanner sColNumScan = new Scanner(System.in);

		int sColNum = 0;
		int preNum = 0;

		for(int i =0; i < sNum; i++) {

			sColNum = sColNumScan.nextInt();

			if(sColNum == preNum){
				changeNum++;
				preNum = 0;
				continue;
			}

			preNum = sColNum;

		}

		System.out.print(changeNum);
		sNumScan.close();
		sColNumScan.close();
	}

}