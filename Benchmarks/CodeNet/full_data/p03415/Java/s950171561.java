import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		String[] aStrings = new String[3];
		for(int i= 0; i < 3;i++){
			aStrings[i] = scan.next();
		}
		for(int i = 0;i < 3;i++){
			System.out.print(aStrings[i].charAt(i));
		}



	}


}
