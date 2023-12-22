import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<String> list=new ArrayList<String>();
		//int[] array = new int[1000000000*2];
		int n = sc.nextInt();
		int k = sc.nextInt();
		final String base36 = Integer.toString(n, k);
		List<String> list=new ArrayList<String>(Arrays.asList(base36.split("")));
		System.out.println(list.size());
	}
}