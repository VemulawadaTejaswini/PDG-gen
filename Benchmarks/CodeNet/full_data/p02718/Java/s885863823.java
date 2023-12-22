import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	
		int total = scanner.nextInt();
	
		long popular = scanner.nextInt();
	
		int[] target = new int[total];
		
		int tokuhyo;
		
		String result = "Yes";
	
		for (int i = 0; i < total; i++) {
		
			target[i] = scanner.nextInt();
		}
		
		scanner.close();
        
        tokuhyo = java.util.Arrays.stream(target).sum();
        
        target = Arrays.stream(target).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        
        long t = 4*popular;
        
  //      System.out.println("t=" + t);
        
        double l = (double)1 / t;
        
  //      System.out.println("l=" + l);
        
        double s = tokuhyo * l;
        
  //      System.out.println("s=" + s);
        
        for (int i = 0; i < popular; i++) {
        	
        	if (target[i] < s) {
        		result = "No";
        	}
        }
        
        System.out.println(result);
	
	}
	

}
