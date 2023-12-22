    import java.util.Scanner;
     
    public class Main{
    	public static void main(String[] args){
    		Scanner scan = new Scanner(System.in);
    		String s = scan.next();
     
    		int length = s.length();
    		int i;
    		for(i = 0; i < length; i++) {
    			System.out.print("x");
    		}
    	}
    }