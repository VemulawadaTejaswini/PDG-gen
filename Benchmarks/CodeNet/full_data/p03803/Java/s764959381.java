public class Main {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if (a == 1){a += 13;}
		if (b == 1){b += 13;}
		
		if (a > b){
			System.out.println("Alice");
		}else if (a < b){
			System.out.println("Bob");
		}else{
			System.out.println("Draw");
		}
	}
}