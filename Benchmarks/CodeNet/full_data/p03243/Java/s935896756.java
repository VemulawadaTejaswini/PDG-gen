import java.util.Scanner;

/**
 * @author Rimi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x = sc.next();

		int a  = Integer.valueOf(x.substring(0 , 1));
		int b  = Integer.valueOf(x.substring(1 , 2));
		int c  = Integer.valueOf(x.substring(2 , 3));


		if(x.length() == 3) {
			for(int i = 1; i <= 9; i++) {
				if(a == 9) {
					System.out.print(9);
					System.out.print(9);
					System.out.print(9);
					break;
				}else if(a == i) {
					if(a == b && a == c) {
						System.out.print(i);
						System.out.print(i);
						System.out.print(i);
						break;
					}else {
						if(a == b) {
							if(a >= c) {
								System.out.print(i);
								System.out.print(i);
								System.out.print(i);
								break;
							}else {
								System.out.print(i+1);
								System.out.print(i+1);
								System.out.print(i+1);
								break;
							}
						}else if(a > b) {
							System.out.print(i);
							System.out.print(i);
							System.out.print(i);
							break;
						}else {
							System.out.print(i + 1);
							System.out.print(i + 1);
							System.out.print(i + 1);
							break;
						}
					}
				}
			}
		}

	}

}
