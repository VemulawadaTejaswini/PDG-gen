import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int A = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		switch(X){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			X = 0;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			X = 1;
			break;
		case 2:
			X = 2;
			break;
		}
		switch(Y){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			Y = 0;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			Y = 1;
			break;
		case 2:
			Y = 2;
			break;
		}
		if(X==Y){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
