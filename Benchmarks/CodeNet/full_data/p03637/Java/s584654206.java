import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		int x,y,z,tmp;
		x=0;y=0;z=0;
		for(int i = 0; i<N; i++){
			tmp=Integer.parseInt(in.next());
			if(tmp%4==0)x++;
			else if(tmp%2==0)y++;
			else z++;
		}
		String ans = "No";
		if(x>=z)ans = "Yes";
		if(x+1>=z&&y%2==0)ans = "Yes";
		if(x==0&&z==0&&y>=2)ans="Yes";
		System.out.println(ans);
	}
}