import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		Scanner vd = new Scanner(System.in);
		char[] cd = vd.next().toCharArray();
		int count = 0;
		for(int i=0; i<3;i++) {
			if(cd[i]=='o') count++;
		}
		System.out.println((700+count*100));


	}

}
