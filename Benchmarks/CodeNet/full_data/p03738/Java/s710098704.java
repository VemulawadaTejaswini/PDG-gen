public class Main {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if(a>b){
			System.out.println("GREATER");
		}else if(a<b){
			System.out.println("LESS");
		}else{
			System.out.println("EQUAL");
		}

	}

}