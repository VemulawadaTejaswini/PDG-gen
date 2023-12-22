import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int nI = Integer.parseInt(n);




		int sum = 0;
		for(int i=1;i<=nI;i++) {
			int keta = 0;
			String iS = String.valueOf(i);
			for(int l=0;l<iS.length();l++) {
				char ketaC[] = new char[iS.length()];
				ketaC[l]=iS.charAt(l);
				keta = keta + Character.getNumericValue(ketaC[l]);
				}
			//各桁の合計＝keta
			if(keta>=a && keta<=b) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		}
	}


