
public class Main {

   public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

     String l = scan.next();
	 String m =scan.next();     
	 String n = scan.next(); 
     String o = scan.next();     
    
    int N = Integer.parseInt(l);//5
    int K = Integer.parseInt(m);//3
    int X = Integer.parseInt(n);//10000
    int Y = Integer.parseInt(o);//9000

    
          	   	 System.out.println(N*X-(X-Y)*(N-K));   
   }
   }
   