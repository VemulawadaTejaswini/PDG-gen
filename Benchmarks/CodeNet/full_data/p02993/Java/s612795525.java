import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
                solve();
	}

    private static void solve() {
    	Scanner sc = new Scanner(System.in);
    	char[] sCode = sc.next().toCharArray();

    	boolean isExistSameCode = false;
    	for(int i = 0; i < 3; i++)
    	{
    		if(sCode[i] == sCode[i+1]) {
    			isExistSameCode = true;
    			break;
    		}
    	}

    	if(isExistSameCode)
    	{
    		System.out.print("Bad");
    	}
    	else System.out.print("Good");
	}
}
