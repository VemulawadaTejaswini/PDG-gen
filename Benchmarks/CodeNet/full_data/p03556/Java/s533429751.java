import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		
		for(int i=0; Math.pow(i,2)<n; i++){
		    ans = (long)Math.pow(i,2);
		}
		
      	System.out.println(ans);
    }
}