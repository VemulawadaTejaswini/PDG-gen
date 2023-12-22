import java.util.*;
 
class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		char[]c=s.next().replaceAll("BC","#").replaceAll("[BC]{2,}"," ").toCharArray();
 
		int r=0;
		for(int i=0;i<c.length-1;++i) {
			if(c[i]=='A'&&c[i+1]=='#') {
				++r;
				c[i]='#';
				c[i+1]='A';
				if(i!=0)i-=2;
			}
		}
		System.out.println(r);
	}
}