import java.util.Calendar;
import java.util.Scanner;

class Main{
  public static void main(String args[]){

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		int a2 = Integer.parseInt(a);

		String b = scan.next();
		int b2 = Integer.parseInt(b);
	  
	  
    Calendar calendar = Calendar.getInstance();

    calendar.set(Calendar.HOUR_OF_DAY,a2);
    calendar.add(Calendar.HOUR,b2);
    
    
	System.out.println(a2+b2);
   
  }
}