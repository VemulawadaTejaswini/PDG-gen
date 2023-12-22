
public class Main {
	public static void main(String[] args){
		String front = args[1];
		String back = args[2];
		
		for(int i=0;i<=back.length();i++){
			String test = front + back.substring(back.length()-i, back.length());
			if(test.indexOf(back) != -1){
				System.out.println(test.length());
				return;
			}
		}
	}
}
