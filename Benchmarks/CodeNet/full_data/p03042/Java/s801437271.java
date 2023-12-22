import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ym = sc.nextInt();

		int i1 = ym/100;
		int i2 = ym%100;
		if((i1 > 0 && i1 < 13)&&(i2 > 12)){
			System.out.println("MMYY");
		}else if((i1 > 12)&&(i2 > 0 && i2 < 13)){
			System.out.println("YYMM");
		}else if((i1 > 0 && i1 < 13)&&(i2 > 0 && i2 < 13)){
			System.out.println("AMBIGUOUS");
		}else{
			System.out.println("NA");
		}
      	sc.close();
	}
}