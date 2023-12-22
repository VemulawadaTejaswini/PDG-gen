import java.io.PrintWriter;
import java.util.Scanner;
  
public class Main {
	
	public static PrintWriter out = new PrintWriter(System.out);
	public static String a;
	public static int all_sum = 0;
	
	public static void func( int index, int pre_sum, int last_plus ){
		
		if( index == a.length() ){
			String sb = a.substring( last_plus, a.length());
			all_sum += pre_sum + Integer.parseInt(sb);
		}
		else{
			func( index + 1, pre_sum, last_plus );
			
			String sb = a.substring( last_plus, index );
			pre_sum += Integer.parseInt(sb);
			last_plus = index;
			func( index + 1, pre_sum, last_plus );
		}
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PrintWriter out = new PrintWriter(System.out)
        
        a = sc.next();
        
        func( 1, 0, 0 );
        out.println( all_sum );
        
        sc.close();
        out.flush();
    }
}