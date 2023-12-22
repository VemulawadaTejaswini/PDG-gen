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
		
		if(list.size() == 3){
			System.out.println("Three");
		}else if(list.size() == 4){
			System.out.println("Four");
		}
	}
}