import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Set<String> list = new HashSet<String>();
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++){
			list.add(sc.next());
		}
		
		System.out.println(list.size());
	}
}