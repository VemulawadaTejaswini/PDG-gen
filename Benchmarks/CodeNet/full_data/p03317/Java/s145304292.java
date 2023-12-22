import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = (int)(Math.ceil((n-1.0)/(k-1.0)));
        System.out.println(ans);
    }    
}
