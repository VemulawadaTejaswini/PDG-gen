import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean ret = new Main().Akihabara(args[0]);
		if(ret) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	public boolean Akihabara(String str) {
		Pattern ptn = Pattern.compile("A?(KIH)A?(B)A?(R)A?");
		Matcher mtc = ptn.matcher(str);
		return mtc.find();
	}

}
