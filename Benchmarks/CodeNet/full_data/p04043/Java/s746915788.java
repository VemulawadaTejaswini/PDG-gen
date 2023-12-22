import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i;
		int check5=0;
		int check7=0;
		Scanner sc = new Scanner(System.in);
		List<Integer> abc = new ArrayList<Integer>();
		abc.add(0,sc.nextInt()); 
		abc.add(1,sc.nextInt()); 
		abc.add(2,sc.nextInt()); 
		for(i=0;i<3;i++) {
			if(abc.get(i)==5) {
				check5++;
			}else if (abc.get(i)==7) {
				check7++;
			}	
		}
		System.out.println(abc.get(0));
		System.out.println(abc.get(1));
		System.out.println(abc.get(2));
		System.out.println(check5);
		System.out.println(check7);
		if(check5==2 & check7==1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}