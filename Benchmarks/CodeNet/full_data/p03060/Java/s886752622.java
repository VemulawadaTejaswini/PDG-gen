import java.util.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int valueArray[] = new int[count];
        int costArray[] = new int[count];
        int ans = 0;
        for(int i = 0; i < count; i++){
			valueArray[i] = scanner.nextInt();
        }
        for(int i = 0; i < count; i++){
			costArray[i] = scanner.nextInt();
        }
        for(int i = 0; i < count; i++){
	        if (costArray[i] >= valueArray[i]) {
	        	continue;
	        }
	        ans = ans + valueArray[i] - costArray[i];
		}
		System.out.println(ans);
	}
}