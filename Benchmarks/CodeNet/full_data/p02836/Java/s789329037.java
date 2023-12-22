import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[][] array = new Integer[m][m];
		String s = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		String g = "";
		for(int i=list.size()-1;i>=0;i--) {
			g = g+list.get(i);
		}
		//System.out.println(g);
		List<String> list_g= new ArrayList<String>(Arrays.asList(g.split("")));
		int count=0;
		for(int i=0;list.size()>i;i++) {
			if(!list.get(i).equals(list_g.get(i)))
				count++;
		}
		System.out.println(count/2);
	}
}