import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[][] array = new int[3][3];
		double l = sc.nextDouble();
		double l_3 = l/3;
		System.out.println(Math.pow(l_3, 3));
	}
}