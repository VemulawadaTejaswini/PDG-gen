import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
 		long square = sc.nextLong() * sc.nextLong();
		System.out.println(square % 2 == 0 ? square / 2 : ++square / 2);
	}
}
