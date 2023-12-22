import java.util.*;
import java.util.Vector;
import java.math.*; 
public class Main {
     Scanner sc = new Scanner(System.in);
	//	System.out.println( );
	
	
	
	void run(){ // kokonikaku
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans;
		if(a>b)ans=2*a-1;
		else if(a<b) ans=2*b-1;
		else ans=2*a;
		System.out.println(ans);
	}

	
	public static void main(String[] args) {
		new Main().run();
        
    }
}