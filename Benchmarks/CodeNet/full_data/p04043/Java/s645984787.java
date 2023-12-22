
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
		Scanner scanner = new Scanner (System.in);
		String input = scanner.nextLine();

		IrohaAndEasy solver = new IrohaAndEasy();

		System.out.println(solver.solve(input));

    }

    static class IrohaAndEasy {

    	public String solve(String input) {

    		String answer;
    		String abc[] = input.split(" ");
    		int five = 0;
    		int seven = 0;
    		int other = 0;

    		for(String n :abc) {
    			Integer i = new Integer(n);
    			if( i== 5) {
    				five++;
    			} else if(i == 7) {
    				seven++;
    			} else {
    				other++;
    			}
    		}

    		if(five == 2 && seven == 1) {
    			answer = "YES";
    		} else {
    			answer = "NO";
    		}
    		return answer;
    	}

    }

}
