import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ans = 1;
		
		
		for(int i=2; i<=a; i++){
		    for(int j=2; (int)Math.pow(i, j)<=a; j++){
		        ans = Math.max((int)Math.pow(i,j),ans);
		    }
		}
		
		System.out.println(ans);
	}
}
