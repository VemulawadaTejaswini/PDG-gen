import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),Q=s.nextInt();
		char[] c=s.next().toCharArray();

		int l=0,r=n;
		char[][] q=new char[Q][2];
		for(int i=0;i<Q;++i){
			q[i][0]=s.next().charAt(0);
			q[i][1]=s.next().charAt(0);
		}
		for(int i=Q-1;i>=0;--i){
			if(q[i][1]=='L'){
				if(			q[i][0]==c[l])		++l;
				if(r<n&&	q[i][0]==c[r])		++r;
			}else{
				if(l>0&&	q[i][0]==c[l-1])	--l;
				if(			q[i][0]==c[r-1])		--r;
			}
		}
		System.out.println(r-l);
	}
}