import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		if(args.length != 2){
			si();
		}else if(args[0].length() != 3){
			si();
		}else if(args[1].length() != 3){
			si();
		}
		Pattern q = Pattern.compile("^[a-z]+$");

		Matcher m1 = q.matcher(args[0]);
		Matcher m2 = q.matcher(args[1]);

		if(!m1.find()){	//falseのとき（英語小文字以外が入ってるとき)
			si();
		}else if(!m2.find()){
			si();
		}


		char[][] x = new char[2][3];
		for(int i=0; i<2; i++){
			x[i] = args[i].toCharArray();
		}

		int p = 0;
		for(int j=0; j<3; j++){
			if(x[0][j] != x[1][2-j]){
				System.out.println("NO");
				p = 1;
				break;
			}
		}
		if(p == 0){
			System.out.println("YES");
		}


	}
	public static void si(){
		System.out.println("NO");
		System.exit(0);
	}

}
