import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		StringBuilder sb = new StringBuilder();
		String string = sc.next();

		for(int i = 0;i < string.length();i++){
			if(string.charAt(i) == '0'){
				sb.append("0");
			}else if(string.charAt(i) == '1'){
				sb.append("1");
			}else{
				if(sb.length()>0){
					sb.deleteCharAt(sb.length()-1);
				}
			}
		}
		System.out.println(sb.toString());


	}
}