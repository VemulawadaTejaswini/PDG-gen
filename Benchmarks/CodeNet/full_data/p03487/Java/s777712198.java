import java.util.HashMap;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		HashMap<Integer,Integer>A=new HashMap<Integer,Integer>();
		int N=stdIn.nextInt();
		int a[]=new int[N];
		int z=0,y=0,x=0,v=0,ans=0;
		while(z<N){
			y=stdIn.nextInt();
			if(A.containsKey(y))
				x=A.get(y);
			else{
				a[v]=y;
				v++;
			}
			A.put(y,x+1);
			x=0;
			z++;
		}z=0;
		while(z<v){
			if(A.containsKey(a[z])){
				x=A.get(a[z]);
				if(x!=0&&x!=a[z])
					if(x>a[z])
						ans+=x-a[z];
					else
						ans+=x;
			}
			z++;
		}
		System.out.println(ans);
	}
}