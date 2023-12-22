import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		String Sdash = scan.next();
		String T =scan.next();
		StringBuilder X = new StringBuilder();
		X.append(Sdash);
		boolean jyouken =false;
		
		String answer = "";
		
		if(T.length()<=Sdash.length()) {//もしTの方が長かったなそもそも条件に合わないので以下の処理しなくていい
			
		
		
		
		for(int i = 0;i<Sdash.length()-T.length()+1;i++) {//Tの文字がSdashの先頭から何番目に入るかチェック
			int okcount = 0;
			for(int j = 0;j<T.length();j++) {//Tの文字とSdashの文字それぞれ比較
				
				if(Sdash.substring(i+j, i+j+1).equals(T.substring(j, j+1))) {//同じ文字ならOK
					okcount+=1;
					}else if(Sdash.substring(i+j, i+j+1).equals("?")) {//文字が？でもok
						okcount +=1;
						}else {//それ以外なら、つまり文字が合ってなければダメ
						}
			}
			
			if(okcount==T.length()) {
				X.replace(i, i+T.length(), T);
				
				for(int z = 0;z<X.toString().length();z++) {//全てaにする
					if(X.toString().substring(z, z+1).equals("?")) {
						X.replace(z, z+1,  "a");
					}
				}
				
				
				if(answer=="") {//初期状態なら入れて良い
					answer = X.toString();
				}else {//前の処理段階でもう見つけてた場合
					if(X.toString().compareTo(answer)<0) {
						answer =X.toString();
					}
				}
				
				
				
				jyouken = true;
				
			}
		}
		
		}
		
		
		
		if(jyouken==false) {
			System.out.println("UNRESTORABLE");
		}else {
			
			
		System.out.println(answer);
		}
		
		
		
		
		
	}

}
