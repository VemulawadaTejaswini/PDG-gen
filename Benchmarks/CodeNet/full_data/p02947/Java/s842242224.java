
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		HashMap<String, Integer> hmap=new HashMap<>();
		for(int i=0;i<n;i++) {
			String str=scn.next();
			char []ch=new char[str.length()];
			for(int j=0;j<str.length();j++) {
				ch[j]=str.charAt(j);
			}
			Arrays.sort(ch);
			str="";
			for(int j=0;j<ch.length;j++) {
				str+=ch[j];
			}
			if(hmap.containsKey(str)) {
				int x=hmap.get(str);
				hmap.put(str,x+1);
			}else {
				hmap.put(str, 1);
			}
		}
		Set<String> set=hmap.keySet();
		long sum=0;
		for(String x:set) {
			int y=hmap.get(x);
			sum+=(int)((y*(y-1))/2);
		}
		System.out.println(sum);
	}

}
