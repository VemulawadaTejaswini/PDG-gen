import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		char[] ch = str.toCharArray();
		int ans =0;
		for (int i=0; i<ch.length-3; i++) {
			if (num1(i, ch) % 2019 ==0) ans+=1;
		}
		for (int i=0; i<ch.length-4; i++) {
			if (num2(i, ch) % 2019 ==0) ans+=1;
		}
		for (int i=0; i<ch.length-5; i++) {
			if (num3(i, ch) % 2019 ==0) ans+=1;
		}

		System.out.println(ans);
	}
	static int num1(int i, char[] ch) {
		int ans = (ch[i]-48)*1000;
		ans+= (ch[i+1]-48)*100;
		ans+= (ch[i+2]-48)*10;
		ans+= (ch[i+3]-48)*1;
		return ans;
	}

	static int num2(int i, char[] ch) {
		int ans = (ch[i]-48)*10000;
		ans+= (ch[i+1]-48)*1000;
		ans+= (ch[i+2]-48)*100;
		ans+= (ch[i+3]-48)*10;
		ans+=ch[i+4]-48;
		return ans;
	}
	static int num3(int i, char[] ch) {
		int ans = (ch[i]-48)*100000;
		ans+= (ch[i+1]-48)*10000;
		ans+= (ch[i+2]-48)*1000;
		ans+= (ch[i+3]-48)*100;
		ans+= (ch[i+4]-48)*10;
		ans+= (ch[i+5]-48)*1;
		return ans;
	}
}
