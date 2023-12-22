import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		char[] a=s.next().toCharArray();

		for(int i=0;i<a.length;++i){
			int t=i%2+a[i];
			if(t=='L'||t=='S'){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
