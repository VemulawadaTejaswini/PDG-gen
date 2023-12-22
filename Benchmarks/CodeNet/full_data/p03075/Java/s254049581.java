import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt(),b = sca.nextInt(),c = sca.nextInt(),d = sca.nextInt(),e = sca.nextInt(),k = sca.nextInt();
		if(e - a > k) System.out.println(":(");
		else System.out.println("Yay!");
	}
}
