public class Main {
	public static void main(String args[]){
		int x,a,b;
		x = new Integer(args[0]).intValue();
		a = new Integer(args[1]).intValue();
		b = new Integer(args[3]).intValue();
		if(a>=b){
			System.out.println("delicious");
		}
		if(a+x>=b || a<b){
			System.out.println("safe");
		}
		if(a+x<b){
			System.out.println("dangerous");
		}
	}
}