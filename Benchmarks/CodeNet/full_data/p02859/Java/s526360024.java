    import java.util.Scanner;
     
     public class Main{
    	public static int Square(int a){
    		int ans = (int) Math.pow(a,2);
    		return ans;	
    		}
    	
    	public static void main(String[] args) {
    		
    		Scanner scan = new Scanner(System.in);
    		int a = scan.nextInt();
    		System.out.println(Square(a));
    		}
    	
    	}