import java.util.*;
class solution{
	public static void main(String args[]){
      	Scanner sc  = new Scanner(System.in);
 		int n = sc.nextInt();
      	int m = sc.nextInt();
      	int ans = (n * (n - 1) )+ (m * (m - 1)) / 2;
        System.out.println(ans);
      
    }
}
