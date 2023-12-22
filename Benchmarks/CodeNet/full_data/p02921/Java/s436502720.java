import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[][] array = new String[100][500];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_origin=new ArrayList<Integer>();
		String s = sc.next();
		String t = sc.next();

		List<String> list_s= new ArrayList<String>(Arrays.asList(s.split("")));
		List<String> list_t= new ArrayList<String>(Arrays.asList(t.split("")));
		int count=0;

		for(int i=0;3>i;i++) {
			String a = list_s.get(i);
			String b = list_t.get(i);
			if(a.equals(b)) {
				count++;
			}
		}

		System.out.println(count);




	}

}