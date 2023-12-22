public class A {

	public static void main(String[] args) {
		
		int r = Integer.parseInt(args[0])*100;
		int g = Integer.parseInt(args[1])*10;
		int b = Integer.parseInt(args[2]);
		
		int number = r + g + b;
		
		if((number % 4) == 0){
			System.out.println("Yes");
		}
		System.out.println("NO");
	}
}
