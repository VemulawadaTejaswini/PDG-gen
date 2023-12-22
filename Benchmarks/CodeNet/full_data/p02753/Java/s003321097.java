import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String S = scan.next();
		String[] array = new String[3];
		boolean flg = true;

		for(int i=0;i<2;i++) {

			array[i]= S.substring(i,i+1);

			if(array[i].equals(array[i+1])) {
				flg = false;
				break;
			}
		}

		System.out.println(flg?"Yes":"No");
		scan.close();

	}

}
