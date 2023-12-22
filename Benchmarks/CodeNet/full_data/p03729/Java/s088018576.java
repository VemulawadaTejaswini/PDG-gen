public class A - Shiritori{
	public void checkChar(String a, String b, String c){
		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		char[] cc = c.toCharArray();

		if((ac[ac.length - 1] == bc[0] )&& (bc[bc.length - 1] == cc[0])){
			System.out.println("true");
		}else{
		System.out.println("No");
		}
	}
}