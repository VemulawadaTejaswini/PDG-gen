import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int ans=0,count=0;
		ans=n*800;
		count=n/15;
		System.out.print(ans-200*count);
    }
}