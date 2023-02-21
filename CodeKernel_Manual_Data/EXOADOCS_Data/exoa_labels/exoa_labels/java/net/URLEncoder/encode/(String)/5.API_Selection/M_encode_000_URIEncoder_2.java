public class A{
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < args.length; i++) {
			String str = args[i];
			
			System.out.println("encode(" + str + ")=" + encode(str));
			System.out.println("decode(" + str + ")=" + decode(str));
		}
	}
}