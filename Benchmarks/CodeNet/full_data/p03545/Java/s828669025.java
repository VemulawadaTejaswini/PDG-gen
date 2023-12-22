import java.util.Scanner;
public class Main{

	static int []a;
	static int []b;
	static int ans;
	static int count;
	public static void main(String[] args) {
		boolean b = false;
		a = new int [4];
		Scanner sc =  new Scanner(System.in);		//入s力

		for(int i = 0;i<4;i++){
			int n = sc.nextInt();				//入力したのをint型に変換
			a[i] = n;
		}			//四つの数字をaに入れる
		int A = a[0];
		int B = a[1];
		int C = a[2];
		int D = a[3];
		int AB = A + B;
		int BA = A - B;
		int BC = B + C;
		int CB = B - C;
		int CD = C + D;
		int DC = C - D;
		for(int i = 0;i < 8;i++){
			switch (i) {
			case 0:
				if(AB + BC + CD == 7)
					System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
				break;
			case 1:
				if(BA + BC + CD == 7)
					System.out.println(A+"-"+B+"+"+C+"+"+D+"=7");
				break;
			case 2:
				if(AB + CB + CD == 7)
					System.out.println(A+"+"+B+"-"+C+"+"+D+"=7");
				break;
			case 3:
				if(AB + BC + DC == 7)
					System.out.println(A+"+"+B+"+"+C+"-"+D+"=7");
				break;
			case 4:
				if(BA + CB + CD == 7)
					System.out.println(A+"-"+B+"-"+C+"+"+D+"=7");
				break;
			case 5:
				if(BA + BC + DC == 7)
					System.out.println(A+"-"+B+"+"+C+"-"+D+"=7");
				break;
			case 6:
				if(AB + CB + DC == 7)
					System.out.println(A+"+"+B+"-"+C+"-"+D+"=7");
				break;
			case 7:
				if(BA + CB + DC == 7)
					System.out.println(A+"-"+B+"-"+C+"-"+D+"=7");
				break;
				

			default:
				break;
			}
		}
		

	}



}
