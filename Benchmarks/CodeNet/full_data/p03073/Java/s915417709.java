import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String S = "i";
		int x = 0;
		Scanner sc = new Scanner(System.in); 
		S = sc.nextLine();
		
		for(int i = 0; i < S.length(); i++)
		{
			if(S.charAt(i) == S.charAt(i + 1))
			{
				if(S.charAt(i + 1) == '0')
				{
					 S = S.substring(0, i) + '1' + S.substring(i + 1); 
					 x++;
				} else if(S.charAt(i + 1) == '1')
				{
					 S = S.substring(0, i) + '0' + S.substring(i + 1); 
					 x++;
				}
			}
		}
		System.out.println(x);

	}

}
