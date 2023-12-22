import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		int m = sc.nextInt();
		int total = 0;
		if(n>0){
			total += n * (n-1) / 2;
		}
		if(m>0){
			total += m * (m-1) / 2;
		}
    System.out.println(total);
	}
}