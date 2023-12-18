public class Main{
	public static void main(String[] args){
		java.util.Scanner sin = new java.util.Scanner(System.in);
		int a = sin.nextInt();
		int b = sin.nextInt();
		if(-1000 <= a && b <= 1000){
			if(a < b){
				System.out.println("a < b");
			}else if(a > b){
				System.out.println("a > b");	
			}else if(a == b){
				System.out.println("a == b");
			}
		}
	}
}
