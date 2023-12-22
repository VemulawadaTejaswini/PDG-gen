import java.util.Arrays;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
public class Main {
	static BigInteger n,m,one=BigInteger.valueOf(1);
	static int k;
	static char[] s=new char[10];
	static int[] l=new int[10];
	static void init() {
		for(int i=0;i<10;++i)
			s[i]=(char) (l[i]+'0');
	}
	static boolean check(BigInteger b) {
		String str=b.toString();
		for(int i=0;i<str.length();++i)
			for(int j=0;j<k;++j)
				if(str.charAt(i)==s[j])
					return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextBigInteger();
		m=n;
		k=sc.nextInt();
		for(int i=0;i<k;++i)
			l[i]=sc.nextInt();
		init();
		while(!check(m))
			m=m.add(one);
		System.out.println(m.toString());
	}
}