import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b= scan.nextInt(),c=scan.nextInt();
		int []array=new int[a];
		for(int i=0;i<c;i++) {
			array[scan.nextInt()-1]++;
		}

		for(int i=0;i<a;i++) {
			if(b+array[i]-c>0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}


	}
}