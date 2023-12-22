public class Main{
	public static void main(String[] args){
		String str = new java.util.Scanner(System.in).nextLine();
		System.out.println(str);
		String answer ="";
		for(int i = 0;i<str.length();i++){
			answer += "x";
		}
		System.out.println(answer);
	}

}