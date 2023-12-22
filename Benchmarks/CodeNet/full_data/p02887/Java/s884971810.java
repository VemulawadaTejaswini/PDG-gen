import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int slime = scan.nextInt();
		String color = scan.next();
		String[] array = new String[slime+1];
		int count = 0;

		for(int i=0;i<slime;i++) {

			array[i] = color.substring(i,i+1);
		}
		for(int i=0;i<slime;i++) {
			if(!array[i].equals(array[i+1])) {
				count++;
			}
		}

		System.out.println(count);
		scan.close();

	}

}
