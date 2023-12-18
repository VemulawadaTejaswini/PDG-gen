public class Main{
	public static void main(String[] args){
		java.util.Scanner sin = new java.util.Scanner(System.in);
		int i = 1;
		int a;
		while(true){
			a = sin.nextInt();
			if(a == 0) break;
			System.out.println("Case " + i++ + ": " + a);	
		}
	}
}
