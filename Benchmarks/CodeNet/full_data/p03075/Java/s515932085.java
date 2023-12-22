import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int abcde[]=new int[5];
		for(int i=0;i<abcde.length;i++) {
			abcde[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		scan.close();
		if(k<(abcde[abcde.length-1]-abcde[0]))System.out.println(":(");
		else System.out.println("Yay!");
	}
}