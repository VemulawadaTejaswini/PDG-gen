import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int k=scanner.nextInt();
		Set<Integer>set=new HashSet<>();
		
		for(int i=0;i<k;i++) {
			int tar=a+i;
			if(tar<=b)set.add(tar);
			else break;
		}
		
		for(int i=k;i>0;i--) {
			int tar=b-i+1;
			if(tar>=a)set.add(tar);
			else break;
		}
		
		for(int i:set) {
			System.out.println(i);
		}
	}
}
