import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int i =0;
        long min = 1_000_000_000;
        while(a>0 && b>0){
            long d = (a-i)*x + (b-i)*y + c*2*i;
            min = Math.min(min,d);
            i++;
        }
        System.out.println(min);
    }
}
