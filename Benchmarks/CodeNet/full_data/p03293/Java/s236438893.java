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
		String s = sc.next();
		String t = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		if(s.equals(t))
			System.out.println("Yes");
		else {
			for(int i=0;list.size()>i;i++) {
				String answer = "";
				String last = list.get(list.size()-1);
				for(int j=list.size()-1;-1<j;j--) {
					if(j!=0) {
						String m = list.get(j-1);
						//System.out.println(m);
						list.set(j, m);
					}
					else
						list.set(0, last);
				}
				for(int j=0;list.size()>j;j++) {
					answer=answer+list.get(j);
				}
				//System.out.println(answer);
				if(answer.equals(t)) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
			System.out.println("No");
		}
	}
}