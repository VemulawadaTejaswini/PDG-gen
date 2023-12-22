import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		List<Queri> qs=new ArrayList<>();
		
		int[] a=new int[m];
		int[] b=new int[m];
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			qs.add(new Queri(a[i],b[i]));
		}
		int cnt=0;
		for(int i=1;i<n;i++){
			for(Queri q:qs){
//				System.out.println(""+q.a+q.b+q.ext);
				if(q.b-1==i&&q.ext){
					for(Queri q2:qs){
						q2.cut(i);
					}
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}

class Queri{
	Queri(int a,int b){
		this.a=a;
		this.b=b;
	}
	int a;
	int b;
	boolean ext=true;
	void cut(int c){
//		System.out.println("cut"+c);
		if(a<=c&&c<b){
			ext=false;
		}
	}
}