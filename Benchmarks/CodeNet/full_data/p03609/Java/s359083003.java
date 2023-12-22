public class Main{
  public static void main (String args){
  Scanner sc = new Scanner(System.in);
		// get a integer
		int X = sc.nextInt();
		// get two integers separated with half-width break
		int t = sc.nextInt();
                System.out.println( X - t < 0 ? 0 : X -t ) ;

 }


}