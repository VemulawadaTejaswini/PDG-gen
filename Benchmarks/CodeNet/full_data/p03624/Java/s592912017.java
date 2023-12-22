import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		String s=scanner.next();

		List<String> data=new ArrayList<String>();

		for(int i=0;i<s.length();i++) {

			String buf=String.valueOf(s.charAt(i));

			if(!data.contains(buf)) {
				data.add(buf);
			}
		}

		for(int i='a';i<='z';i++) {

			char buf=(char)i;

			if(!data.contains(String.valueOf(buf))) {
				System.out.println(buf);
				break;
			}


		}

		if(data.size()==26) {
			System.out.println("None");
		}






		scanner.close();

	}

	public static int getsumofkakuketa(int n) {

		int result=0;

		while(true) {

			result+=n%10;

			if(n/10!=0) {
				n/=10;
			}else {
				return result;
			}
		}



	}

	public static boolean isMacthed(int a,int b,int sum) {

		if(sum>=a && sum<=b) {
			return true;
		}else {
			return false;
		}

	}



}





