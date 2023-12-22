import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		String s = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		if(list.size()%2!=0){
			System.out.println("No");
			System.exit(0);
		}
		String a = "";
		for(int i=0;list.size()/2>i;i++) {
			a=a+list.get(i);
		}
		a=a+a;
		if(a.equals(s))
			System.out.println("Yes");
		else{
			System.out.println("No");
		}
	}
}