import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt();
		int maypay = (int) (pay / 1.1);
		boolean flg = true;
		while(flg){
			if(maypay * 1.08 == pay){
				System.out.println(maypay);
				flg = false;
			}else{
				maypay ++;
			}
			if(maypay == pay){
				System.out.println(":(");
				flg = false;
			}
		}
	}
}


