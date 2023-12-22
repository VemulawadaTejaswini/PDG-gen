import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		n = n > 1 ? combination(n, 2) : 0;
		m = m > 1 ? combination(m, 2) : 0;
		System.out.println(n + m);
	}
	
	//nCr
	public static int combination(int n, int r){
		int num = 1;
		for(int i=1; i<=r; i++){
			num = num * (n - i + 1) / i;
		}
		return num;
	}
}
