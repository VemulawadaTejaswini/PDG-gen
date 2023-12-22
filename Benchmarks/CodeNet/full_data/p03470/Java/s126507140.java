import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		int n = input.nextInt();
		for(int i =0;i<n;i++){
			set.add(input.nextInt());
		}
		System.out.println(set.size());
	}
}
