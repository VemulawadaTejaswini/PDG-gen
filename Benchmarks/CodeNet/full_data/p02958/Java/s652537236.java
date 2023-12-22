import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		
		int t=scn.nextInt();
		
		for(int i=0;i<t;i++) {
			int x=scn.nextInt();
			
			list.add(x);
			list1.add(x);
		}
		Collections.sort(list);
		
		int count=0;
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i)!=list1.get(i)) {
				count++;
				if(count>3) {
					break;
				}
			}		
		}
		if(count<3) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		scn.close();
	}
}