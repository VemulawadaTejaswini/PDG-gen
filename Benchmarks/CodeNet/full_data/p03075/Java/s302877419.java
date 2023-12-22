import java.util.Scanner;
public class Main {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] point=new int[6];
		for(int points:point) {
			points=scanner.nextInt();
		}
		if(point[4]-point[0]>point[5]) {
			System.out.println(":(");
		}else {
			System.out.println("Yay!");
		}


	}
}