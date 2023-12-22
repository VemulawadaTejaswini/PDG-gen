import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        
        int sum = 0;
        while(n > 0) {
        	sum += sc.nextInt();
            n--;
        }
      	if(sum >= h)
        	System.out.println("Yes");
        else
            System.out.println("No");
    }
}