import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		char[]c=('#'+s.next()+'#').toCharArray();
		ArrayList<Integer>l=new ArrayList<>();
		for(int i=1;i<c.length;++i)
			if(c[i]!=c[i-1])
				l.add(i);
		int max=0;
		for(int i=1;i<l.size();++i)
			max=Math.max(max,l.get(i)-l.get(i-1));
		System.out.println(max);
	}
}
