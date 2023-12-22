import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p1 = a+a-a*b;
        int p2 = a+b-b*b;
        System.out.println(Math.max(p1, p2));
    }
}
