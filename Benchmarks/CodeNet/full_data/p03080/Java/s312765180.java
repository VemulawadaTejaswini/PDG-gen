import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n = sc.nextInt();
			String s= sc.next();
			StringBuffer sb=new StringBuffer();
			sb.append(s);
			int index;
			int rednum=0;
			int bluenum=0;
			// 文字列の入力
			for(index=0;index<n;index++) {
				if(sb.substring(index,index+1).equals("R")) {
					rednum++;
					}
				else {
					bluenum++;
				}
			if(rednum>bluenum) {
		    	System.out.println("Yes");
		    	break;
		    }
			else {
		    	System.out.println("No");
		    	break;
		    }
			}
	}
}