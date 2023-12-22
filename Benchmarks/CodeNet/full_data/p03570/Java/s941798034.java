
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static int res=0;
	public static void main(String[] args) throws Exception {

		// setOut();
		String str = sc.nextLine();
		List<String> l=new ArrayList<String>();
		l.add(str);
		while(l.size()!=0){
			str=l.get(0);
			l.remove(0);
			List<String> tmp=help(str);
	
			l.addAll(tmp);
		}
		System.out.println(res);

	}

	private static List<String> help(String str) {
		// TODO Auto-generated method stub
		String strr = "A";
		for (char c : str.toCharArray()) {
			strr += c;
			strr += "A";
		}
		int[] longest = new int[strr.length()];
		int[] map = new int[128];
		for (int i = 0; i < strr.length(); i++) {
			map = new int[128];
			int s=i-1,f=i+1;
			map[strr.charAt(i)]++;
			int count=1;
			longest[i]=1;
			while(s>=0&&f<strr.length()){
				count++;
				map[strr.charAt(s--)]++;
				map[strr.charAt(f++)]++;
				if(check(map)<2)
					longest[i]=count;	
			}
		}
		
		int max=0;
		int pos=0;
		for(int i=0;i<longest.length;i++){

			if(longest[i]>max){
				max=longest[i];
				pos=i;
			}
		}
		res++;
		List<String> l=new ArrayList<String>();

		String str1=strr.substring(0, pos-max+1).replace("A","");


		String str2=strr.substring(pos+max).replace("A","");

		if(str1.length()!=0) l.add(str1);
		if(str2.length()!=0) l.add(str2);
		return l;
		

	}

	private static int check(int[] map) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 'a'; i <= 'z'; i++) {
			if (map[i] % 2 == 1)
				count++;
		}
		if (count == 0)
			return 1;
		return count;
	}

}