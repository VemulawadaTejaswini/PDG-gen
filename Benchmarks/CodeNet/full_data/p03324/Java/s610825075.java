import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int x1 = Math.pow(100,d);
        System.out.println((int)x1 *(n + n/100));
    }
}
