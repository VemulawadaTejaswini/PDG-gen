import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[3];
		Arrays.setAll(a, i -> sc.nextInt());
		int five = 0, seven = 0;
		for(int n : a){
			if(n == 5){
				five++;
			}else if(n == 7){
				seven++;
			}
		}
		System.out.println(five == 2 && seven == 1 ? "YES" : "NO");
	}
}
