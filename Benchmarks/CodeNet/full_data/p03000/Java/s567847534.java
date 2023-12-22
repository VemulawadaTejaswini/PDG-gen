import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        
        List<Integer> l = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++) {
        	l.add(scanner.nextInt());
        }
        int currentPlace = 0;
        int c = 0;
        for(int k = 0; k < n; k++) {
        	if(currentPlace <= x) {
        		c ++;
        	}
        	currentPlace = currentPlace + l.get(c);
        }
        
        System.out.println(c);
    }

}