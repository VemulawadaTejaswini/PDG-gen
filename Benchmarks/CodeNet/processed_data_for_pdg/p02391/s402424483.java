public class Main {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner (System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a < b){
				System.out.println("a < b");
			}else if(a > b){
				System.out.println("a > b");
			}else{
				System.out.println("a == b");
			}
	}
}
