import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		if (d>=Math.abs(c-a)){
        	System.out.println("Yes");
        }else if (d>=Math.abs(c-b)){
        	if (d>=Math.abs(b-a)){
            	System.out.println("Yes");
            }
        }else{
        	System.out.println("No");
        }
      
    }
}