public class Main {
	public static void main(String[] args) {

		String s =args[0];

		int i = Integer.parseInt(s);

		if(i == 1){
			System.out.println("Hello World");
			return;
		}else if(i==2) {
			int i1 = Integer.parseInt(args[1]);
			int i2 = Integer.parseInt(args[1]);

			System.out.println(i1+i2);
			return;

		}
	}
}

