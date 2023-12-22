import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		double sum = 0;
		for(int i=0; i<n; i++){
			sum += 1.0 / Integer.parseInt(sc.next());
		}
		
		System.out.println(1 / sum);
	}
}
