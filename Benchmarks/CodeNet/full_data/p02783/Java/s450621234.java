import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int count = 0;
		for(int i=0; h>0; i++){
			h -= a;
			count++;
		}
		System.out.println(count);
	}
}
