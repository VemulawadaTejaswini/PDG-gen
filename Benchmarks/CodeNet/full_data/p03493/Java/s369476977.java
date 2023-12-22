
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int ans = 0;
		final String one = "1";

		for(String a : args){
			if(one.equals(a))
				ans++;
		}

		System.out.println(ans);
	}

}
