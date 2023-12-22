import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
		String s = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		int count=0;
		loop:while(true) {
			int length = list.size();
			//System.out.println(length);
			if(length<=1)
				break;
			int i=0;
			while(true) {
				if(list.get(i).equals("0")) {
					if(list.get(i+1).equals("1")) {
						list.remove(i+1);
						list.remove(i);
						count=count+2;
						break;
					}
				}
				else {
					if(list.get(i+1).equals("0")) {
						list.remove(i+1);
						list.remove(i);
						count=count+2;
						break;
					}
				}
				//System.out.println(i);
				i++;
				if(i+1==length)
					break loop;
			}
			//System.out.println(count);
		}
		System.out.println(count);
	}
}