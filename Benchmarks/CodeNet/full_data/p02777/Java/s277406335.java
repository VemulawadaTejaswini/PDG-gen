import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(sc.next().equals(a)) {
        	c--;
        }else {
        	d--;
        }
        System.out.println(c + " " + d);
	}
}