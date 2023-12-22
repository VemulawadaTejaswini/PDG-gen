import java.util.Scanner;

public class Main {
	final static int ICHIMANEN_AMOUNT = 10000;
	final static int GOSENEN_AMOUNT = 5000;
	final static int SENEN_AMOUNT = 1000;
	
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int osatsuNum = scan.nextInt();
		int otoshidamaAmount = scan.nextInt();

		int ichimanenNum = osatsuNum;
		int gosenenNum = 0;
		int senenNum = 0;

		while (ichimanenNum >= 0) {
			gosenenNum = osatsuNum - ichimanenNum;
			while (gosenenNum >= 0) {
				senenNum = osatsuNum - ichimanenNum - gosenenNum;
				if (isMatch(ichimanenNum, gosenenNum, senenNum, otoshidamaAmount)) {
					System.out.print(ichimanenNum + " " + gosenenNum + " " + senenNum);
					return;	
				}
				gosenenNum--;
			}
			ichimanenNum--;
		}	
        System.out.print(-1 + " " + -1 + " " + -1);
	} 

	static boolean isMatch(int ichimanenNum,  int gosenenNum, int senenNum,  int otoshidamaAmount) {

		int calcResult = ICHIMANEN_AMOUNT * ichimanenNum + GOSENEN_AMOUNT * gosenenNum + SENEN_AMOUNT * senenNum;
		
		return calcResult == otoshidamaAmount;
	}

}
