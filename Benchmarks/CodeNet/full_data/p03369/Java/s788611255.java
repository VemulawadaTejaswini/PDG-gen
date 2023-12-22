import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int count = 0;
		
		String s = stdIn.next();
		
		for(int i = 0; i < 3; i++)
		{
			if(s.charAt(i) == 'o')
			{
				count++;
			}
		}
		
		System.out.println(700 + count * 100);

	}

}
