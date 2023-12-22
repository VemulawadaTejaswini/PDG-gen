import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		char[] c=s.next().toCharArray();
		ArrayList<Integer> l=new ArrayList<>();
		l.add(0);
		for(int i=1;i<c.length;++i)
			if(c[i]!=c[i-1])
				l.add(i);
		l.add(c.length);
		int max=0;
		if(l.size()==2)
			max=l.size();
		else if(l.size()==3)
			max=Math.max(l.get(1),c.length-l.get(1));
		else{
			for(int i=2;i<l.size();++i)
				max=Math.max(max,l.get(i)-l.get(i-2));
		}
		System.out.println(max);
	}
}
