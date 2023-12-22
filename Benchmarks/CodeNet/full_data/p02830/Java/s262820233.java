import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int nagasa = scan.nextInt();
		String moziS = scan.next();
		String moziT = scan.next();
		String[] newmozi = new String[nagasa*2];
		String re = "";


		for(int i=0;i<nagasa;i++) {

			newmozi[i] = moziS.substring(i,i+1) + moziT.substring(i,i+1);
			re += newmozi[i];
		}

		System.out.println(re);
		scan.close();

	}

}
