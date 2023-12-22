    import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int a = scan.nextInt();
			int b = scan.nextInt();
			int r = 2*b;
			if(a>r)
			{
				System.out.println(a-r);
			}
			else
				System.out.println("0");
    	}
    }