import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		int n = Integer.parseInt(in.nextLine());
		String s = in.nextLine();
		String t = s;
		String tmp = s;
		do{
			s = tmp;
			tmp = s.replaceAll("()", "");
		}while(s.length() != tmp.length());


		int a = 0;
		String f = "", b = "";
		for(int i = 0 ; i < s.length(); i++){
			if(s.charAt(i) == '('){
				if(a == 0){
					a++;
				}else{
					b += ")";
				}

			}else{
				if(a == 0){
					f += "(";
				}else{
					a--;
				}

			}
		}
		if(a > 0){
			for(int i = 0 ; i < a; i++){
				b += ")";
			}
		}else if(a < 0){
			for(int i = 0 ; i < -a; i++){
				f += "(";
			}
		}
		System.out.println(f + t + b);
	}

}