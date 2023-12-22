import java.util.Scanner;

public class Main {
public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] numArray = new int[n];
			for (int i = 0; i < n; i++)
			{
				numArray[i] = sc.nextInt();
			}
			int max_gcd = 1;
			for (int i = 0; i < n; i++)
			{
				for(int j = i + 1; j < n; j++)
				{
					int x;
					int y;
					if (numArray[i] > numArray[j]) {
				            x = numArray[i];
				            y = numArray[j];
				        } else {
				            x = numArray[j];
				            y = numArray[i];
				        }
					int tmp;
					while ((tmp = x % y) != 0) {
				            x = y;
				            y = tmp;
				        }
					
					if(y >= max_gcd)
					{
						max_gcd = y;
					}
				}
			}
			System.out.println(max_gcd);
		}
	}
