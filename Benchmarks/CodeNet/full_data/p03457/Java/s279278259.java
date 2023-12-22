import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan =new Scanner(System.in);
		int t,old_t=0,x,y,old_x=0,old_y=0;
		int n=Integer.parseInt(scan.nextLine());
		boolean ans =true;
		int d,tmp;
		for (int i = 0;i < n; ++i){
			t=Integer.parseInt(scan.next());
			x=Integer.parseInt(scan.next());
			y=Integer.parseInt(scan.next());scan.nextLine();
			d=Math.abs(x-old_x)+Math.abs(y-old_y);
			old_x=x;old_y=y;
			tmp=t;
			t=Math.abs(old_t-t);
			old_t=tmp;
			if (t>=d){
				if (!((t-d)%2==0)){
					ans=false;
				}
			}else{
				ans = false;
			}

		}

		System.out.print(ans?"Yes":"No");

	}
}
//end
