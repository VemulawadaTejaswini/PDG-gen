import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_gold=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		//List<String> list=new ArrayList<String>();

		String s = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		long k = sc.nextInt();
		String start = list.get(0);
		String last = list.get(list.size()-1);
		long count=0;
		if(start.equals(last)) {
			int gyaku=0;
			for(int i=list.size()-1;0<i;i--) {
				if(!list.get(i).equals(list.get(i-1)))
					break;
				gyaku++;
			}

			for(int i=0;list.size()-1>i;i++) {
				int ren=1;
				while(true) {
					if(list.size()-1==i)
						break;
					if(!list.get(i).equals(list.get(i+1)))
						break;
					i++;
					ren++;
				}
				if(ren>1)
					count=count+ren/2;
				//System.out.println(count);
			}
			if(gyaku%2==1)
				System.out.println(count*k);
			else
				System.out.println(count*k);
		}
		else {
			for(int i=0;list.size()-1>i;i++) {
				int ren=1;
				while(true) {
					if(list.size()-1==i)
						break;
					if(!list.get(i).equals(list.get(i+1)))
						break;
					i++;
					ren++;
				}
				if(ren>1)
					count=count+ren/2;
			}
			System.out.println((long)count*k);
		}
	}

}