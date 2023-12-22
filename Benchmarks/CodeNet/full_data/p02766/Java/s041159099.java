/**
 *
 */
package hello_world;

import java.util.Scanner;

/**
 * @author hellb
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String iNum1 = scan.next();
        int inum2 = scan.nextInt();
        int iResult = Integer.parseInt(iNum1, inum2);

        String sResult = String.valueOf(iResult);

        int iLength = sResult.length();

        System.out.print(iLength);
	}
}
