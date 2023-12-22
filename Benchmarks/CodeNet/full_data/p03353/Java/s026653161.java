import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();

		List<String> maybe=new ArrayList<String>();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String kari=s.substring(i, j);
				boolean kari0=true;
				for(int n=0;n<maybe.size();n++) {
					if(kari.equals(maybe.get(n))) {
						kari0=false;
					}
				}
				if(kari0) {
					maybe.add(kari);
					int genzaichi=maybe.size()-1;
					while(genzaichi!=0&&maybe.get(genzaichi).compareTo(maybe.get(genzaichi-1))<0) {
						String a=maybe.get(genzaichi);
						maybe.set(genzaichi, maybe.get(genzaichi-1));
						maybe.set(genzaichi-1, a);
						genzaichi--;
					}
				}
			}
		}

		System.out.print(maybe.get(k-1));




	}

}
