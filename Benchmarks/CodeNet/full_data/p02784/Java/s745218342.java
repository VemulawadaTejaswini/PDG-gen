import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
		
		System.out.println(h <= Arrays.stream(a).sum() ? "Yes" : "No");
	}
}
