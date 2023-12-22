import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        long w = sc.nextInt();
        long h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        long value = w * h;
        if (x == w / 2 && w % 2 == 0 && y == h / 2 && h % 2 == 0) {
            if (value % 2 == 0) {
                System.out.println(value / 2 + ".0 " + 1);
            } else {
                System.out.println(value / 2 + ".5 " + 1);
            }
        } else {
            if (value % 2 == 0) { 
                System.out.println(value / 2 + ".0 " + 0);
            } else {
                System.out.println(value / 2 + ".5 " + 0);
            }
        }
	}
}
