import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 1;

        while ((a-1) * count + 1 < b) {
            count++;
        }

        System.out.println(count);
	}
}
