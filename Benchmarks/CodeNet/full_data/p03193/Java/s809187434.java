import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int count = 0;
        for (int i = 0; i < N; i++) {
            int currnetH = sc.nextInt();
		    int currentW = sc.nextInt();
		    if (H <= currnetH && W <= currentW) {
		        count++;
		    }
        }
        
        System.out.println(count);
	}
}