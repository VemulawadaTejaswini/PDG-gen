import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] substr = str.split(" ", 0);

		int n1 = Integer.parseInt(substr[0]);
		int n2 = Integer.parseInt(substr[1]);
		int n3 = Integer.parseInt(substr[2]);

		str = scan.nextLine();
		substr = str.split(" ", 0);

		int n4 = Integer.parseInt(substr[0]);
		int n5 = Integer.parseInt(substr[1]);
		int n6 = Integer.parseInt(substr[2]);

		str = scan.nextLine();
		substr = str.split(" ", 0);

		int n7 = Integer.parseInt(substr[0]);
		int n8 = Integer.parseInt(substr[1]);
		int n9 = Integer.parseInt(substr[2]);

		int n = scan.nextInt();

		int [] index = new int[10];
		for (int j=0; j<n; j++) {
			int i = scan.nextInt();
			if (i == n1) index[1]=1;
			if (i == n2) index[2]=1;
			if (i == n3) index[3]=1;
			if (i == n4) index[4]=1;
			if (i == n5) index[5]=1;
			if (i == n6) index[6]=1;
			if (i == n7) index[7]=1;
			if (i == n8) index[8]=1;
			if (i == n9) index[9]=1;
 		}
		scan.close();
		String ans="No";
		if (index[1]==1 && index[2]==1 && index[3]==1) ans="Yes";
		if (index[4]==1 && index[5]==1 && index[6]==1) ans="Yes";
		if (index[7]==1 && index[8]==1 && index[9]==1) ans="Yes";
		if (index[1]==1 && index[4]==1 && index[7]==1) ans="Yes";
		if (index[2]==1 && index[5]==1 && index[8]==1) ans="Yes";
		if (index[3]==1 && index[6]==1 && index[9]==1) ans="Yes";
		if (index[1]==1 && index[5]==1 && index[9]==1) ans="Yes";
		if (index[7]==1 && index[5]==1 && index[3]==1) ans="Yes";

		System.out.println(ans);
	}
}
