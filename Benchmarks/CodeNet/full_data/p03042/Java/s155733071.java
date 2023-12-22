import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int S = stdIn.nextInt();
		int a[] = new int[4];
		for(int i = 3; i >= 0; i--) {
			a[i] = S%10;
			S = S/10;
		}
		
		if(a[0] == 0 && a[1] >=1) {
			if(a[2] == 0 && a[3] >= 1) {
				System.out.println("AMBIGUOUS");
			}
			else if(a[2] == 1) {
				if(a[3] <= 2) {
					System.out.println("AMBIGUOUS");
				}
				else {
					System.out.println("MMYY");
				}
			}
			else {
				System.out.println("MMYY");
			}
		}
		else if (a[0] == 1) {
			if(a[1] <= 2) {
				if(a[2] == 0 && a[3] >= 1) {
					System.out.println("AMBIGUOUS");
				}
				else if(a[2] == 1) {
					if(a[3] <= 2) {
						System.out.println("AMBIGUOUS");
					}
					else {
						System.out.println("MMYY");
					}
				}
				else {
					System.out.println("MMYY");
				}
			}
			else {
				if(a[2] == 0 && a[3] >= 1) {
					System.out.println("YYMM");
				}
				else if (a[2] == 1) {
					if(a[3] <= 2) {
						System.out.println("YYMM");
					}
					else {
						System.out.println("NA");
					}
				}
				else {
					System.out.println("NA");
				}
			}
		}
		else {
			if(a[2] == 0 && a[3] >= 1) {
				System.out.println("YYMM");
			}
			else if(a[2] == 1) {
				if(a[3] <= 2) {
					System.out.println("YYMM");
				}
				else {
					System.out.println("NA");
				}
			}
			else {
				System.out.println("NA");
			}
		}

	}

}