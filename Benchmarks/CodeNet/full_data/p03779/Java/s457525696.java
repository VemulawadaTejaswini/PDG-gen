import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        long X = sc.nextLong();

        long count = 0;
        for (long i = 1; i <= X; i++) {
        	if (count + i == X - 1) {
        		continue;
        	} else {
        		count += i;
        	}
        	
        	if (count == X) {
        		System.out.println(i);
        		break;
        	}
        }
    } 
        
}	