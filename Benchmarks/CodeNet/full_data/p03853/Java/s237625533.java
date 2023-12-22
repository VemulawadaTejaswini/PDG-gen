import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		sc.nextLine();
		String[] s = new String[h];
		Arrays.setAll(s, i -> sc.nextLine());
		for(int i=0; i<h; i++){
			System.out.println(s[i]);
			System.out.println(s[i]);
		}
	}
}
