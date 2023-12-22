import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String A = str.substring(0, 1);
		String B = str.substring(2, 3);
		if(A.equals(B)) System.out.println("Yes");
		else System.out.println("No");
	}
}
