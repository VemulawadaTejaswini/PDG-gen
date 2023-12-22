import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int sum = x/(y+z);
        x = x - (sum-1)*(y+z);
        sum = sum + x/(y+y+z);
        System.out.println(sum);
	}
}