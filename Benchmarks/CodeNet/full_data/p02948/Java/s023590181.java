import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		ArrayList<Work> works=new ArrayList<Work>();
		for(int i=0;i<N;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			works.add(new Work(a,b));
		}
		Collections.sort(works,new Comp());

		int reward=0;
		for(int i=1;i<=M;i++) {
			Work max=new Work(0,0);
			for(int j=0;j<works.size();j++) {
				Work w=works.get(j);
				if(w.a<=i&&w.b>max.b) {
					max=w;
				}

				if(w.a>i) {
					break;
				}
			}
			if(works.contains(max)) {
				works.remove(max);
			}
			reward+=max.b;
		}
		System.out.println(reward);
	}
}
class Work{
	int a;
	int b;
	Work(int _a,int _b){
		a=_a;
		b=_b;
	}
}
class Comp implements java.util.Comparator<Work>{
	public int compare(Work a,Work b) {
		if(a.a>b.a) {
			return 1;
		}else {
			return -1;
		}
	}
}