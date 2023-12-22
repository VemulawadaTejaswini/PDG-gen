import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        long n = sc.nextLong();
        long index = (long)Math.sqrt(n);

        while (n % index != 0) {
            index--;
        }
        System.out.println(index + (n / index) - 2);
	}
}
