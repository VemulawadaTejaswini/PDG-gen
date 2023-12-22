import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		int n = sc.nextInt();
		String s = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		int count=0;
		for(int i=0;n-1>i;i++) {
			if(list.get(i).equals(list.get(i+1)))
				count++;
		}

		System.out.println(n-count);
	}
}

