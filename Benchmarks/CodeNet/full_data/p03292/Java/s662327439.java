    import java.util.Scanner;
     
    public class Main {
    	public static void main (String[] args) {
    		Scanner sc = new Scanner(System.in);
    		
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int c = sc.nextInt();
    		
    		int maxab = Math.max(a, b); 
    		int minab = Math.min(a, b);
    		
    		int max = Math.max(maxab, c);
    		int min = Math.min(minab, c);
    		
    		System.out.println(max - min);
    		
    	}
    }