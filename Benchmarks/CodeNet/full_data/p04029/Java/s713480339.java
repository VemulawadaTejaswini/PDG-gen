import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int b =0;
    	for (int i=1;i <= N;i++){
    	  b += i;
    	}
    
    	System.out.println(b);
    }
}