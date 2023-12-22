import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cntK = sc.nextInt();
		int cntT = sc.nextInt();
		int a[] = new int[cntT];

		for (int i=0; i < cntT; i++){
			a[i] = sc.nextInt();
		}

		int maxa = a[0];

		for (int i=1; i < cntT; i++){
			if( maxa < a[i]){
				maxa = a[i];
			}
		}

		int syurui = 0;
		if (cntT == 1){
			syurui = cntK - 1;
		} else if (cntK%2 <= maxa){
			//System.out.println(syurui);
		} else {
			syurui = cntK -  maxa;
		}

		System.out.println(syurui);

	}

}