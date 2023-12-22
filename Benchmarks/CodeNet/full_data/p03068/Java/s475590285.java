import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n;
			String  s;
			int k;
			String result="";
			n = sc.nextInt();
			s = sc.next();
			k = sc.nextInt();
			sc.close();
			
			int index,len;
			String s1,target;
			len=s.length();
			target=s.substring(k,k+1);
			
			for (index=0;index<len;index++) {
				s1=s.substring(index,index+1);
				if(s1.equals(target)) {
					result=result+target;
				}
				else {
					result=result+"*";
				}
			}

			// 出力

			System.out.println(result);
	}
}