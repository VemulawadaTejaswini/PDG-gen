import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int x=0;
		int y=0;
		for(int i=0;i<W.length();i++){
			switch (W.charAt(i)){
			case 'N':
				if(y==-1){
					y=0;
				}else if(y==0){
					y=1;
				}
			break;
			case 'W':
				if(x==-1){
					x=0;
				}else if(x==0){
					x=1;
				}

			break;
			case 'S':
				if(y==1){
					y=0;
				}else if(y==0){
					y=-1;
				}

				break;
			case 'E':
				if(x==1){
					x=0;
				}else if(x==0){
					x=-1;
				}
				break;
			}
		}

		if(x==0&&y==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}




	}
}
