import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[][] array = new int[3][3];
		int n = sc.nextInt();
		int m = sc.nextInt();
		int gu = (n*(n-1))/2;
		int ki = (m*(m-1))/2;
		//System.out.println(gu);
		//System.out.println(ki);
		//System.out.println(4*3/2);
		System.out.println(gu+ki);
	}
}