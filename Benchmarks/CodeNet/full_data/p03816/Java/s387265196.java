import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		HashSet<Integer> list = new HashSet<Integer>();
		int count = 0;
		for(int i=0;i<n;i++){
			int c = list.size();
			list.add(scanner.nextInt());
			if(c != list.size()){
				count++;
			}
		}
		System.out.println(count-((n-count)%2));
	}

}
